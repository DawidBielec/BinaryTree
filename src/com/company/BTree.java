package com.company;

public class BTree {

    Node root;

    private boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {

        if (isEmpty()) {
            root = new NodeImpl(value);
        } else {

            Node marker = root;
            Node parent = null;
            while (marker != null) {

                parent = marker;

                if(value < marker.getKey() ){
                    marker = marker.getLeft();
                }else{
                    marker = marker.getRight();
                }
            }

            Node newNode = new NodeImpl(value);

            if( value < parent.getKey()){
                parent.setLeft(newNode);
            }else{
                parent.setRight(newNode);
            }

        }
    }
}