import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent // Declare AppComponent here
  ],
  imports: [
    BrowserModule
  ],
  bootstrap: [AppComponent] // Bootstrap the main AppComponent
})
export class AppModule { }