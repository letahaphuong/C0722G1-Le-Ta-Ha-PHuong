import {Component, OnInit} from '@angular/core';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor(private toast: ToastrService) {
  }

  ngOnInit(): void {
  }

  employee(): void {
    this.toast.error('Chức năng chưa được mở', 'Notification');
  }
}
