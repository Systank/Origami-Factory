import { Component, OnInit } from '@angular/core';

import {Admin} from './admin';

import {AdminService} from './admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  private formAdmin: Admin= null;

  constructor(private adminService: AdminService) {
  }

  ngOnInit() {
  }

  public list() {
    return this.adminService.findAll();
  }

  public add() {
    this.formAdmin = new Admin();
  }

  public edit(id: number) {
    this.formAdmin = this.adminService.findById(id);
  }

  public save() {
    this.adminService.save(this.formAdmin);
    this.formAdmin = null;
  }

  public delete(id: number) {
    this.adminService.delete(this.adminService.findById(id));
  }
  public cancel() {
    this.formAdmin = null;
  }
}




