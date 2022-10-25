/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kulsomzaraei
 */
public class CasualFactory implements OutfitFactory{
    
    
    @Override
    public Pants showPants(){
    return new CasualPants();
    }
    
    
     @Override
    public Shoes showShoes(){
    return new CasualShoes();
    }
    
       @Override
    public Top showTop(){
    return new CasualTop();
    
    }
}
