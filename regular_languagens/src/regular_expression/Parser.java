package regular_expression;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.*;

public class Parser {
    String regex;
    int pos=0;
    
    public Parser(RegularExpression e) {
        this.regex=e.regularExpression.replace(".","");
    }
    
    public Node parse () {
        Node root = regex();
        
        if(pos != regex.length()) {
            System.out.println("Regex invalido");
        }
        
        return root;
    }
    
    private char peek(){
        return regex.charAt(pos);    
    }
    
    private void eat(char c){
        if(peek() == c)
            pos++;
        else {
            System.out.println("Esperando:"+ c +"; recebi:" + peek());
        }
    }
    private char next(){
        char c = peek();
        eat(c);
        return c;
    }
    
    private boolean more() {
        return this.pos < this.regex.length() ;
    }
    
    private Node regex() {
        //<regex> ::= <term> '|' <regex> | <term>
        Node term = term();
        if(more() && peek() == '|'){
            next();
            Node r = this.regex();
            return new Node('|', term, r);
        } else {
            return term;
        }
        
    }
    private Node term() {
    //<term> ::= <factor> <term> | <factor>   
        Node factor = factor() ;
        if(more() && peek() != ')' && peek() != '|'){
            Node term = term();
            factor = new Node('.',factor, term);
        }
        return factor;
    }
    
    
    private Node factor() {
    //<factor> ::= <base> { '*' } | <base> { '?' }
        Node base = base();
        while(more() && (peek() == '*' || peek() == '?')){
            base = new Node(next(), base, null);
        }
        return base;
    }
    private Node base() {
    //<base> ::= <char> | '(' <regex> ')'
        Pattern p = Pattern.compile("[A-z0-9&]");
        Matcher m = p.matcher(peek()+"");
        if(m.matches()){
            return new Node(next(), null, null);
        } else if(peek() == '('){
            eat('(');
            Node r = regex();
            eat(')');
            return r;
        }
        return null;
    }
    
    public void thread(Node root){
        ArrayList<Node> list = new ArrayList<>();
        Node node = root;
        while(!list.isEmpty() || node != null){
            if(node != null){
                list.add(node);
                node = node.left;
            } else {
                node = list.remove(list.size()-1);
                if(node.right == null){
                    if(!list.isEmpty()){
                        node.right = list.get(list.size()-1);
                        node = null;
                    } else{
                        node.right = new Node('&', null, null);
                        node = null;
                    }
                } else {
                    node = node.right;
                }
            }
        }
    }
    

}
   
