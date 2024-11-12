import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { routes } from './app.routes'; // Import routes if needed

@NgModule({
  declarations: [
    AppComponent // Add your main component here
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes) // Configure routes if `app.routes.ts` exports routes
  ],
  providers: [], // Import `app.config.ts` if you have services or configurations
  bootstrap: [AppComponent] // The root component to bootstrap
})
export class AppModule { }
