//Thsi declaration tells where this java class lives
//it tells us what package is belong  to
//there's one pckage that's always imported implicitly
package Lesson;
//You can manually import this user defined package
//but the
import OtherPackage.CodeThatINeed;

import java.util.ArrayList;
import java.util.List;

import static OtherPackage.CodeThatINeed.valueThatINeed;

public class Lesson {
    //Packaging code
    //What does it mean to package code
    //Packaging code is pretty much a way to organize your code
    //Ther are two type of packages
    //there are built in pakages
    //and there are user defined packages
public static void main(String[] args){
    //In order for our integer List to work, we always need to import.
    List<Integer> integerList = new  ArrayList();
    System.out.println("This program works!");
    //There are packages and classes with the same name
    //it'll be up to you to determine the correct import
    //the IDE is pretty smart, so 7/10 you can relyon it
    //as you can continue using it, the IDE should get better at guessing your imports.
    //now I want to import from my userdefined package
    System.out.println("This value comes from a custom package "+ CodeThatINeed.valueThatINeed);

    //ultimately packages are just folders
    //don't over think it,thgey're pretty much there to help you organize your code.
    //it makes sense to group code that is doing similar things or have similar behavior



}
}
