import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {HomeRoutingModule} from './home-routing.module';
import {HomeComponent} from './home/home.component';
import {NavComponent} from './nav/nav.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';


@NgModule({
  declarations: [HomeComponent, NavComponent, HeaderComponent, FooterComponent],
  imports: [
    CommonModule,
    HomeRoutingModule
  ],
  exports: [
    FooterComponent,
    NavComponent,
    HeaderComponent
  ]
})
export class HomeModule {
}
