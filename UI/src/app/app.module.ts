import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { routes } from './app.routes'; // Routes imported

// Import CoreUI and any standalone services/modules
import { DropdownModule, SidebarModule } from '@coreui/angular';
import { IconSetService } from '@coreui/icons-angular';

@NgModule({
  declarations: [
    AppComponent // Declare your main AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    SidebarModule,
    DropdownModule,
    RouterModule.forRoot(routes, {
      onSameUrlNavigation: 'reload',
      scrollPositionRestoration: 'top',
      anchorScrolling: 'enabled',
      initialNavigation: 'enabledBlocking',
      useHash: true // Optional, based on your needs
    })
  ],
  providers: [
    IconSetService // Add standalone services here
  ],
  bootstrap: [AppComponent] // Bootstrap with AppComponent
})
export class AppModule { }
