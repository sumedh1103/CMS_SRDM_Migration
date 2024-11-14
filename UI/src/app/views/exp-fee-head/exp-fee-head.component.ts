import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ExpFeeHeadService, ExpFeeHeadEntity } from './exp-fee-head.service'; // Import the interface here
import { HttpClientModule } from '@angular/common/http';
import { GridModule, CardModule, FormModule, ButtonModule } from '@coreui/angular';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-exp-fee-head',
  templateUrl: './exp-fee-head.component.html',
  styleUrls: ['./exp-fee-head.component.scss'],
  standalone: true,
  providers: [ExpFeeHeadService],
  imports: [
    CommonModule, 
    HttpClientModule, 
    GridModule, 
    CardModule, 
    FormModule, 
    ButtonModule,
    FormsModule // Ensure FormsModule is included
  ]
})
export class ExpFeeHeadComponent implements OnInit {
  
  // Explicitly type 'id' to be either a number or undefined
  formValue: { 
    id: number | undefined; 
    fee_head: string; 
    amount: number; 
  } = {
    id: undefined,  // id can be undefined initially
    fee_head: '',
    amount: 0
  };

  customStylesValidated: boolean = false;

  feeHeads: ExpFeeHeadEntity[] = []; // To store the list of fee heads

  constructor(private expFeeHeadService: ExpFeeHeadService) {}

  onSubmit11(form: NgForm) {
    if (form.valid) {
      let data: ExpFeeHeadEntity;
      
      // Prepare data without 'id' for add operation
      data = {
        feeHead: this.formValue.fee_head,
        amount: this.formValue.amount,
        by_user: 'YASH',
        date: new Date().toISOString().split('T')[0],
        time: new Date().toLocaleTimeString(),
        id: this.formValue.id // This will be undefined for adding a new entry
      };
  
      // If formValue.id exists, include it for update operation
      if (this.formValue.id !== undefined) {
        this.expFeeHeadService.updateExpFeeHead(this.formValue.id, data).subscribe(
          response => {
            console.log('Updated successfully', response);
            this.fetchFeeHeads();  // Fetch the updated list after editing
            form.reset();
          },
          error => {
            console.error('Error updating entry', error);
          }
        );
      } else {
        // If id doesn't exist, perform an add
        this.expFeeHeadService.addExpFeeHead(data).subscribe(
          response => {
            console.log('Form submitted successfully', response);
            this.fetchFeeHeads();  // Fetch the updated list after adding
            form.reset();
          },
          error => {
            console.error('Error submitting form', error);
          }
        );
      }
    } else {
      console.log('Form is invalid');
    }
  }
  
  fetchFeeHeads() {
    this.expFeeHeadService.getAllExpFeeHeads().subscribe(
      response => {
        this.feeHeads = response; // Store the fetched fee heads
      },
      error => {
        console.error('Error fetching fee heads', error);
      }
    );
  }

  editFeeHead(index: number) {
    const feeHead = this.feeHeads[index];
    // Populate the form with the selected fee head data
    this.formValue.id = feeHead.id;
    this.formValue.fee_head = feeHead.feeHead;  // Correct property name
    this.formValue.amount = feeHead.amount;
  }
  
  deleteFeeHead(index: number) {
    const feeHeadId = this.feeHeads[index].id;
    if (feeHeadId !== undefined) {
      this.expFeeHeadService.deleteExpFeeHead(feeHeadId).subscribe(
        response => {
          console.log('Deleted successfully', response);
          this.feeHeads.splice(index, 1); // Remove the deleted fee head from the list
        },
        error => {
          console.error('Error deleting entry', error);
        }
      );
    } else {
      console.error('Invalid feeHead ID');
    }
  }

  onSubmitUpdate(form: NgForm, id: number) {
    if (form.valid) {
      const updatedData: ExpFeeHeadEntity = {
        id,  // Ensure 'id' is added for the update
        feeHead: form.value.fee_head,
        amount: form.value.amount,
        by_user: 'YASH',
        date: new Date().toISOString().split('T')[0],  // Current date
        time: new Date().toLocaleTimeString()          // Current time
      };
  
      // Pass both id and updatedData to the updateExpFeeHead method
      this.expFeeHeadService.updateExpFeeHead(id, updatedData).subscribe(
        response => {
          console.log('Updated successfully', response);
          form.reset();
        },
        error => {
          console.error('Error updating fee head', error);
        }
      );
    }
  }
  

  ngOnInit(): void {
    this.fetchFeeHeads();  // Fetch fee heads when the component loads
  }
}
