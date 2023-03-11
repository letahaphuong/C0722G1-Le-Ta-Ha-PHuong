import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {CustomerRoutingModule} from './customer-routing.module';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {CustomerDeleteComponent} from './customer-delete/customer-delete.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {HomeModule} from '../home/home.module';
// import {NgxPaginationModule} from 'ngx-pagination';



@NgModule({
  declarations: [
    CustomerListComponent,
    CustomerEditComponent,
    CustomerCreateComponent,
    CustomerDeleteComponent],
    imports: [
        CommonModule,
        CustomerRoutingModule,
        ReactiveFormsModule,
        NgxPaginationModule,
        FormsModule,
        Ng2SearchPipeModule,
        HomeModule,
        // NgxPaginationModule
    ]
})
export class CustomerModule {
}
