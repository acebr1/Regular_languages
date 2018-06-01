//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package regular_expression;

import java.util.Set;

public class Node {
    static int numberNodes = 0;
    public char symbol;
    public Node left = null;
    public Node right = null;
    int label;
    boolean up = false, down = false;

/**
 * Constructor com parâmetros
*/ 
    public Node(char symb, Node left, Node right) {
        this.symbol = symb;
        this.left = left;
        this.right = right;
        if(symbol == '*' || symbol == '|' || symbol == '.' || symbol == '?' || symbol == '&') {
            label = -1;
        } else {
            label = ++numberNodes;  
        }

    }

/**
   * Retorna o conjunto de nós alcançáveissubindo neste nó
*/ 
    public void up(Set<Node> set){
        if(up)
            return;
        up = true;
        switch (this.symbol) {
            case '|':
                Node node = right;
                while(node.symbol == '.' || node.symbol == '|'){
                    node = node.right;
                }
                node.right.up(set);
                break;
            case '.':
                right.down(set);
                break;
            case '*':
                left.down(set);
                right.up(set);
                break;
            case '?':
                right.up(set);
                break;
            default:
                set.add(this);
                break;
        }
        return;
    }

/**
   * Retorna o conjunto de nós acessíveis ao descer neste nó
*/     
    public void down(Set<Node> set){
        if(down)
            return;
        down = true;
        switch (this.symbol) {
            case '|':
                left.down(set);
                right.down(set);
                break;
            case '.':
                left.down(set);
                break;
            case '*':
                left.down(set);
                right.up(set);
                break;
            case '?':
                left.down(set);
                right.up(set);
                break;
            default:
                set.add(this);
                break;
        }
    }

/**
   * Pegar a variável label
*/    
    public int getLabel() {
        return label;
    }

/**
   * Visualizar
*/   
    @Override
    public String toString() {
        return "("+this.symbol+""+this.label+")"; //To change body of generated methods, choose Tools | Templates.
    }

/**
   * Reiniciar variáveis
*/     
    public void clear(){
        up = false;
        down = false;
    }

/**
   * Sub-árvore
*/    
    public void subTree(Set<Node> set){
        if(!set.contains(this)){
            set.add(this);
            if(left != null){
                left.subTree(set);
            }
            if(right != null){
                right.subTree(set);
            }
        }
    }
    
    
}
