package model;

public class Controller {
    private BinarySearchTree bst;
    public Controller(){
        bst = new BinarySearchTree();
    }

    public BinarySearchTree getBst() {
        return bst;
    }

    public String addScoreRegister(int score, String name){
        ScoreRegister sr = new ScoreRegister(score, name);
        boolean added =bst.addScoreRegister(sr);
        return added? "Added": "Not added";
    }

    public String searchRegister(int value){
        ScoreRegister obj = bst.search(value);
        if(obj!=null){
            return obj.toString();
        }else{
            return "Value not found";
        }
    }

    public String alphabeticalOrder(){
        return bst.alphabeticalOrder();
    }

    public void setBst(BinarySearchTree bst) {
        this.bst = bst;
    }
}
