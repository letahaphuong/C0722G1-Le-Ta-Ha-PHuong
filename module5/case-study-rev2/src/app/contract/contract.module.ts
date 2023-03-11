import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContractRoutingModule } from './contract-routing.module';
import { ContractListComponent } from './contract-list/contract-list.component';
import { ContractCreateComponent } from './contract-create/contract-create.component';
import {HomeModule} from '../home/home.module';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import {FormsModule} from '@angular/forms';


@NgModule({
  declarations: [ContractListComponent, ContractCreateComponent],
  imports: [
    CommonModule,
    ContractRoutingModule,
    HomeModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    FormsModule
  ]
})
export class ContractModule { }
