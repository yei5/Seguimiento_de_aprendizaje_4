package model;

public class BinarySearchTree  {
    private ScoreRegister root;

    public BinarySearchTree() {}

    public boolean addScoreRegister(ScoreRegister node){
        if(root == null){
            root = node;
            return true;
        }
        return insert(node, root);

    }

    private boolean insert(ScoreRegister node, ScoreRegister current){
        if(node.getScore() < current.getScore()){
            if(current.getLeft() == null){
                current.setLeft(node);
                return true;
            }
            insert(node, current.getLeft());
        }else if (node.getScore()> current.getScore()){
            if(current.getRight() == null){
                current.setRight(node);
                return true;
            }
            insert(node, current.getRight());
        }
        return false;
    }

    public String printInOrder(){
        return printInOrder(root);
    }

    public String printInOrder(ScoreRegister current){
        if(current == null) return "";
        return printInOrder(current.getLeft()) + current.toString() + "\n" + printInOrder(current.getRight());
    }



    public ScoreRegister search(int value){
        return search(root,value);
    }

    private ScoreRegister search(ScoreRegister current, int value){
        if(current==null) return null;
        else if (value == current.getScore()) return current;
        else if (value > current.getScore()) return search(current.getRight(),value);
        else if (value < current.getScore()) return search(current.getLeft(),value);
        else return null;

    }

    public String alphabeticalOrder(){
        BinarySearchTree bst = new BinarySearchTree();
        bst=alphabeticalOrder(root, bst);
        return bst.printInOrder()+"2a"+printInOrder();

    }

    private BinarySearchTree alphabeticalOrder(ScoreRegister current, BinarySearchTree bst){
        if(current == null) return bst;
        bst.insertString(current);
        alphabeticalOrder(current.getLeft(), bst);
        alphabeticalOrder(current.getRight(), bst);
        return bst;
    }

    private void insertString(ScoreRegister current){
        ScoreRegister node = new ScoreRegister(current.getScore(), current.getName());
        if(root == null){
            root = node;
        }else{
            insertString(node, root);
        }
    }

    private void insertString(ScoreRegister node, ScoreRegister current){
        if(search(node.getScore())!=null){
            return;
        }
        if(node.compareTo(current)<0){
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                insertString(node, current.getLeft());
            }
        }else if (node.compareTo(current)>0){
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                insertString(node, current.getRight());
            }
        }
    }
    public String topFive(){
        return  printReverse(getMax(),5);
    }

    private String printReverse(ScoreRegister current, int count){
        if(current == null) return "";
        if(count == 0) return "";
        return printReverse(current.getRight(), count-1) + current.toString() + "\n" + printReverse(current.getLeft(), count-1);
    }

    public ScoreRegister getMin(){
        return getMin(root);
    }

    private ScoreRegister getMin(ScoreRegister current){
        if(current.getLeft() == null) return current;
        else return getMin(current.getLeft());
    }

    public ScoreRegister getMax(){
        return getMax(root);
    }

    private ScoreRegister getMax(ScoreRegister current){
        if(current.getRight() == null) return current;
        else return getMax(current.getRight());
    }

    public ScoreRegister getRoot() {
        return root;
    }

    public void setRoot(ScoreRegister root) {
        this.root = root;
    }

}
