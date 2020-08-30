import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeadlinesComponent } from './headlines/headlines.component';
import { HeadlinesDetailsComponent } from './headlines-details/headlines-details.component';
import {HttpClientModule} from '@angular/common/http';
import {from} from 'rxjs';
@NgModule({
  declarations: [
    AppComponent,
    HeadlinesComponent,
    HeadlinesDetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
