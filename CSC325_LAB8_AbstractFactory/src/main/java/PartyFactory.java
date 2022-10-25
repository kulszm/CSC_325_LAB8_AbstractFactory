/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kulsomzaraei
 */
public class PartyFactory implements OutfitFactory{
    
    
    @Override
    public Pants showPants(){
    return new PartyPants();
    }
    
    
     @Override
    public Shoes showShoes(){
    return new PartyShoes();
    }
    
       @Override
    public Top showTop(){
    return new PartyTop();
    }
    