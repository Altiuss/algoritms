
//First level: Дано бинарное дерево поиска. Реализовать метод поиска в нем элемента.
//        В качестве параметра этому методу передается value. Метод должен вернуть true/false, если value представлено в дереве.
//        Второй вариант, что метод должен вернуть указатель на найденный элемент или null, если value не представлено в дереве.
//        Реализовать можно один из предложенных вариантов.



public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(37);
        tree.insert(27);
        tree.insert(4);
        tree.insert(27);
        tree.insert(49);
        tree.insert(42);
        tree.insert(84);
        tree.insert(22);
        System.out.println(tree.findElem(55));
    }
}
