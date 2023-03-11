import {Component, OnInit} from '@angular/core';
import {ContractDto} from '../model/contractDto';
import {ContractService} from '../service/contract.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {

  contractDtos: ContractDto[] = [];
  searchText: any;
  p = 1;

  constructor(private contractService: ContractService,
              private toast: ToastrService
  ) {
  }

  ngOnInit(): void {
    this.getAllContract();
  }

  getAllContract(): void {
    this.contractService.getAllContract().subscribe(data => {
      this.contractDtos = data;
    }, error => {
      console.log(error);
      this.toast.error('Data No content', 'Notification');
    });
  }

  noti(): void {
    this.toast.warning('Dịch vụ đang update', 'Notification');
  }

  create(): void {
    this.toast.warning('Ứng dụng đang được cập nhât!', 'Notification');
  }
}
