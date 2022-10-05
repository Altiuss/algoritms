//First level: Реализовать алгоритм обхода двоичного дерева поиска в ширину.
//        Здесь можно применить, изученную нами ранее, структуру данных Queue.
//        Решение представить либо в виде кода, либо в виде псевдокода (блок-схемы и т.д.).


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);


        tree.passWidth();

    }
}
