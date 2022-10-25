/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kulsomzaraei
 */
public class ProfessionalFactory implements OutfitFactory{
    
    
    @Override
    public Pants showPants(){
    return new ProfessionalPants();
    }
    
    
     @Override
    public Pants showShoes(){
    return new ProfessionalShoes();
    }
    
    
}
