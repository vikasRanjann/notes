import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'date',
})
export class DatePipe implements PipeTransform {
  transform(value: unknown, ...args: unknown[]): unknown {
    const str = value as string;
    return str.split('T')[0];
  }
}
