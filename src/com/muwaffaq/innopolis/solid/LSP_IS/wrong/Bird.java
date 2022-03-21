package com.muwaffaq.innopolis.solid.LSP_IS.wrong;
//❌❌❌
// how many SOLID Does it Violates ?
// Fix it.

interface Animal{
    void eat();
}

interface Waterfown extends Animal{
    void swim();
}

interface Flying extends Animal{
    void fly();

}

 interface Bird extends Animal  {
    void hatch();
}
