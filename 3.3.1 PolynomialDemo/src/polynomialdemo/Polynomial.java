/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #1.1
 */

package polynomialdemo;

public class Polynomial implements PolynomialADT
{
    private PolyNode firstNode;

    public Polynomial()
    {
        this.firstNode = null;
    }
    
    public Polynomial(PolyNode firstNode) 
    {
        this.firstNode.setCoef(firstNode.getCoef());
        this.firstNode.setExpo(firstNode.getExpo());
        this.firstNode.setNext(firstNode.getNext());
    }
    
    public Polynomial(Polynomial polynomial) 
    {
        this.firstNode = polynomial.getFirstNode();
    }

    public PolyNode getFirstNode() 
    {
        return this.firstNode;
    }

    public void setFirstNode(PolyNode firstNode) 
    {
        this.firstNode = firstNode;
    }
    
    public boolean isEmpty()
    {
        return (this.firstNode == null);
    }
    
    public void addPolyNodeFirst(int coef, int expo)
    {
        PolyNode node = new PolyNode(coef, expo);
        node.setNext(this.getFirstNode());
        this.setFirstNode(node);
    }
    
    public void addPolyNodeLast(int coef, int expo)
    {
        if(!isEmpty())
        {
            PolyNode temp = this.getFirstNode();
            
            while(temp.getNext() != null)
                temp = temp.getNext();
            
            temp.setNext(new PolyNode(coef, expo));
        }
        else
        {
            this.firstNode = new PolyNode(coef, expo);
        }
    }
    
    public void addPolyNode(int coef, int expo)
    {
        addPolyNodeLast(coef, expo);
    }
    
    //non-static thus any object can make a call to this method,
    //the outcome will only be depended on only the method arguments.
    public Polynomial addPolynomials(Polynomial p1, Polynomial p2)
    {
        if(p1 == null && p2 == null) return null;
        
        else if(p1 == null) return p2;
        
        else if(p2 == null) return p1;
        
        else
        {
            Polynomial result = new Polynomial();
            
            PolyNode temp1 = p1.getFirstNode(), temp2 = p2.getFirstNode();
            boolean flag = true;
            while(temp1 != null)
            {
                while(temp2 != null)
                {
                    if(temp1.getExpo() == temp2.getExpo())
                    {
                        result.addPolyNodeLast(temp1.getCoef() + temp2.getCoef(), temp1.getExpo());
                        flag = false;
                    }
                    temp2 = temp2.getNext();
                }
                temp2 = p2.getFirstNode();
                if(flag)
                {
                    result.addPolyNodeLast(temp1.getCoef(), temp1.getExpo());
                }
                else
                {
                    flag = true;
                }
                temp1 = temp1.getNext();
            }
            
            temp1 = p1.getFirstNode(); 
            temp2 = p2.getFirstNode();
            flag = true;
            
            while(temp2 != null)
            {
                while(temp1 != null)
                {
                    if(temp2.getExpo() == temp1.getExpo())
                    {
                        flag = false;
                    }
                    temp1 = temp1.getNext();
                }
                temp1 = p1.getFirstNode();
                if(flag)
                {
                    result.addPolyNodeLast(temp2.getCoef(), temp2.getExpo());
                }
                flag = true;
                temp2 = temp2.getNext();
            }
            
            return result;
        }
    }
    
    public void arrangeInDescending()
    {
        if(!isEmpty())
        {
            Polynomial newList = new Polynomial();
            PolyNode curr = this.getFirstNode(), max = curr;
            
            while(curr != null)
            {
                while(curr != null)
                {
                    //gets the max degree node
                    if(curr.getExpo() > max.getExpo())
                    {
                        max = curr;
                    }
                    curr = curr.getNext();
                }
                
                //adds the max degree PolyNode
                newList.addPolyNodeLast(max.getCoef(), max.getExpo());
                
                //removes the added max degree PolyNode
                remove(max);
                max = this.getFirstNode();
                curr = this.getFirstNode();
            }
            //Changing the firstNode pointer to the newly created arranged list
            this.setFirstNode(newList.getFirstNode());
        }// if(the original list wasn't empty) ends
        
        //else if (the original list was empty) -- do nothing
    }
    
    public void remove(PolyNode node)
    {
        if(!isEmpty())
        {
            PolyNode curr = this.getFirstNode(),
                     prev = curr;
            while(curr != null)
            {
                if(curr.getCoef() == node.getCoef() && 
                   curr.getExpo() == node.getExpo() && 
                   curr.getNext() == node.getNext())
                {
                    if(curr == this.getFirstNode())
                    {
                        //Removing the first node.
                        this.setFirstNode(curr.getNext());
                        
                        //Exits the method
                        //Found the node to remove
                        return;
                    }
                    else
                    {
                        prev.setNext(curr.getNext());
                        
                        //Exits the method
                        //Found the node to remove
                        return;
                    }
                }//Did not found the node to remove
                else
                {
                    prev = curr;
                    curr = curr.getNext();
                }
            }
        }//if(the Polynomial wasn't empty) ends
        //else if (the Polynomial is empty) -- do nothing
    }
    
    public String toString()
    {
        String s = "";
        PolyNode curr = this.getFirstNode();
        
        while(!isEmpty() && curr.getNext() != null)
        {
            if(curr.getNext().getCoef() < 0)
            {
                s += curr + " - ";
            }
            else
            {
                s += curr + " + ";
            }
            curr = curr.getNext();
        }
        if(!isEmpty() && this.getFirstNode().getCoef() < 0)
        {
            s = "-" + s;
        }
            
        s += curr;
            
        return s;
    }
}
