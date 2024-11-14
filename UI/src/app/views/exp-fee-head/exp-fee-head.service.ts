import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// Assuming ExpFeeHeadEntity is the type for your data, adjust accordingly
export interface ExpFeeHeadEntity {
  id: number | undefined;
  feeHead: string;
  amount: number;
  by_user: string;
  date: string;
  time: string;
}

@Injectable({
  providedIn: 'root'
})
export class ExpFeeHeadService {
  private apiUrl = 'http://localhost:8080/api/exp-fee-heads'; // Adjust API URL

  constructor(private http: HttpClient) {}

  // Method to add a new fee head
  addExpFeeHead(data: ExpFeeHeadEntity): Observable<ExpFeeHeadEntity> {
    return this.http.post<ExpFeeHeadEntity>(this.apiUrl, data);
  }

  // Method to delete a fee head
  deleteExpFeeHead(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/${id}`);
  }

  // Method to update an existing fee head
  updateExpFeeHead(id: number, updatedFeeHead: ExpFeeHeadEntity): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/${id}`, updatedFeeHead);
  }

  // Method to get all fee heads
  getAllExpFeeHeads(): Observable<ExpFeeHeadEntity[]> {
    return this.http.get<ExpFeeHeadEntity[]>(this.apiUrl);
  }
}
