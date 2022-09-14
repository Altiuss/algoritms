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
  removeFromEnd(item) {
    let p = this.head;
    let q = this.head;
    for (let i = 0; i < k; i++) {
      if (q.next != null) {
        q = q.next;
      } else if (i == k - 1) {
        this.head = this.head.next;
      } else {
        document.write("No such element");
        console.log("No such element");
        return;
      }
    }
    while (q.next != null) {
      q = q.next;
      p = p.next;
    }
    p.next = p.next.next;
  }
}

let list = new List();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.add(7);
list.add(8);
list.add(9);
list.add(10);
let k = 2;
list.removeFromEnd(k);
list.printList();
