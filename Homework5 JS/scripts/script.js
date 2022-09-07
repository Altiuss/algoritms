// First level: Дан односвязный список, в котором хранятся целые числа. Написать метод,
// который в качестве параметра принимает число k. Метод должен найти в списке элемент со значением,
//  равным k и удалить его из списка. Предполагаем, что такой элемент есть в списке обязательно и он встречается там один раз.
// Пример, 1 -> 2 -> 3 -> 4 -> 5 (исходный список). Вызываем метод remove(3).
// 1 -> 2 -> 4 -> 5 (результирующий список).

class Node {
  value;
  next;
}
class List {
  #head = null;
  #tail = null;

  add(item) {
    let temp = new Node();
    temp.value = item;
    if (this.head == null) {
      this.head = temp;
    } else {
      this.tail.next = temp;
    }
    this.tail = temp;
  }
  printList() {
    let temp = this.head;
    while (temp != null) {
      document.write(temp.value + "<br></br>");
      console.log(temp.value);
      temp = temp.next;
    }
  }
  remuve(item) {
    if (this.head.value === item) {
      this.head = this.head.next;
      return;
    }
    let temp = this.head;
    let prev = this.head;
    while (temp.next !== null) {
      prev = temp;
      temp = temp.next;
      if (temp.value === item) {
        break;
      }
    }
    prev.next = temp.next;
    if (temp === this.tail) {
      this.tail = prev;
    }
  }
}
let list = new List();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
let k = 3;
list.remuve(k);
list.printList();
