import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from './admin.service';
import {Admin} from './admin';


@Component({
  templateUrl: './admin-detail.component.html',
  styleUrls: ['./admin-detail.component.css']
})
export class AdminDetailComponent implements OnInit {

  private admin : Admin = new Admin();

  constructor(private route: ActivatedRoute, private adminService: AdminService ) {
    this.route.params.subscribe(params => {
      console.log(params['id']);
      this.adminService
        .findById(Number(params['id']), true)
        .subscribe(resp => this.admin = resp.json());
    });
  }

  ngOnInit() {
  }
}
