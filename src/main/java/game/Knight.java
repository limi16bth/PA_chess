/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author gersc
 */
public class Knight extends Figure implements java.io.Serializable {

    public Knight(int x, int y, boolean black, Field field ) {
        super(x, y, black, field);
        if (black) {
            imagePath = "/knight_black.png";

        } else {
            imagePath = "/knight_white.png";
        }
    }

    
    @Override
    protected boolean checkTarget(int lastX, int newX, int lastY, int newY) {
        int resultX;
        int resultY;
        
        if( lastX < newX ) {
            resultX = newX - lastX;
        } else {
            resultX = lastX - newX;
        }
        
        if( lastY < newY ) {
            resultY = newY - lastY;
        } else {
            resultY = lastY - newY;
        }
        
        if ( (resultX == 2 && resultY == 1) || resultX == 1 && resultY == 2) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean checkCollision(int lastX, int newX, int lastY, int newY) {
        return true;
    }

}
