import { Injectable } from '@angular/core';


@Injectable()
export class AppConfigService {
  apiUrl: string = 'http://localhost:8080/origami-factory-web/api/';
}
