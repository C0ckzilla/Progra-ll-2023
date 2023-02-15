#include <stdio.h>
#include <string.h> //Biblioteca de manejo de cadenas de caracteres

    struct User
    {
        float balance;
        char genere;
        char name[50];
        char password[19];
        char email[50];
    };

    void printUser(void) { 
    
    struct User user1;
    user1.balance = 5820.00;
    user1.genere = 'F';
    strcpy(user1.name, "Rosario");
    strcpy(user1.password, "soylamejor");
    strcpy(user1.email, "rosario@gmail.com");

    
    printf ("Balance: %f \n", user1.balance);
    printf ("Genero: %c \n", user1.genere);
    printf ("Nombre: %s \n", user1.name);
    printf ("Nombre: %s \n", user1.password);
    printf ("Nombre: %s \n", user1.email);
   
    }

int main () 
{
    printf("Datos de Usuario\n");
    printUser ();

    
}