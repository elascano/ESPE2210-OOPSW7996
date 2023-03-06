#include<iostream>
#include<conio.h>
#include<array>
#define TAM 6
using namespace std;

void ingresar_numeros(int arreglo[],int tam);
void mostrar_numeros(int arreglo[],int tam);
void append(int arreglo[],int tam, int opcion);
void clear_num(int arreglo[], int tam);
void extend(int arreglo[], int tam);
void count_num(int arreglo[], int tam, int numero, int contador);
void index(int arreglo[], int tam);
void insert_num(int arreglo[], int tam, int opcion);
void pop(int arreglo[], int tam);
void remove_num(int arreglo[], int tam);
void reverse_num(int arreglo[], int tam, int n, int i);
void sort_num(int arreglo[], int tam, int i, int j, int aux);

int main(){
    int n,i;
    int tam,j,aux;
    int numeros[5];
    int numero;
    int contador = 0;
    int a;
    int opcion;
    int num[TAM];
    cout<<"     [ M E N U ] " <<endl;
    cout<<""<<endl;
    cout<<" ESCOJA EL METODO A REALIZAR: " <<endl;
    cout<<""<<endl;
    cout<<" Append   ( 1 ) " <<endl;
    cout<<" Clear    ( 2 ) "<<endl;
    cout<<" Extend   ( 3 ) "<<endl;
    cout<<" Count    ( 4 ) " <<endl;
    cout<<" Index    ( 5 ) "<<endl;
    cout<<" Insert   ( 6 ) "<<endl;
    cout<<" Pop      ( 7 ) " <<endl;
    cout<<" Remove   ( 8 ) "<<endl;
    cout<<" Reverse  ( 9 ) "<<endl;
    cout<<" Sort     ( 10 ) "<<endl;
    cout<<"" <<endl;
    cin>>a;
    switch (a){
        case 1:
            system("cls");
            cout<< "OPCION APPEND: Agrega un elemento al final de la lista"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            append(num,TAM,opcion);
            system("cls");
            return main();
        break;
        case 2:
            system("cls");
            cout<< "OPCION CLEAR: Vacia todos los elementos de la lista"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            clear_num(num,TAM);
            system("cls");
            return main();

        break;
        case 3:
            system("cls");
            cout<< "OPCION EXTEND: Une una lista a otra"<<endl;
            extend(num,TAM);
            system("cls");
            return main();
        break;
        case 4:
            system("cls");
            cout<< "OPCION COUNT: Cuenta el numero de veces que aparece un valor"<<endl;
            count_num(num,TAM,numero,contador);
            system("cls");
            return main();
        break;
        case 5:
            system("cls");
            cout<< "OPCION INDEX: Devuelve el Indice en el que aparece un valor"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            index(num,TAM);
            system("cls");
            return main();
        break;
        case 6:
            system("cls");
            cout<< "OPCION INSERT: Agrega un valor a la lista en un indice especifico"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            insert_num(num,TAM,opcion);
            system("cls");
            return main();
        break;
        case 7:
            system("cls");
            cout<< "OPCION POP: Extrae un valor de la lista y lo borra"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            pop(num,TAM);
            system("cls");
            return main();
        break;
        case 8:
            system("cls");
            cout<< "OPCION REMOVE: Borra el primer valor de la lista cuyo valor concuerde con el que indicamos"<<endl;
            ingresar_numeros(num,TAM);
            mostrar_numeros(num,TAM);
            remove_num(num,TAM);
            system("cls");
            return main();
        break;
        case 9:
            system("cls");
            cout<< "OPCION REVERSE: Le da la vuelta a la lista actual"<<endl;
            reverse_num(num,TAM,n,i);
            system("cls");
            return main();
        break;
        case 10:
            system("cls");
            cout<< "OPCION SORT: Ordena automaticamente los valores de una lista por su valor de menor a mayor:"<<endl;
            sort_num(num,TAM,i,j,aux);
            system("cls");
            return main();
        break;
}
}

void ingresar_numeros(int arreglo[],int tam){
    int i;
    cout<<" I N G R E S E    5    N U M E R O S: "<<endl;
    for(i=0; i<5; i++){
    cout<<"" <<endl;
    cout<<"Ingrese el numero "<<i+1<<": "<<endl;
    cin>>arreglo[i];
}
}

void mostrar_numeros(int arreglo[],int tam){
    int i;
    cout<<"" <<endl;
    cout<<"" <<endl;
    cout<< " -   Numeros Ingresados :   -"<<endl;
    cout<<"" <<endl;
    for(i=0; i<5; i++){
    cout<<"Posicion ["<<i<<"] = "<<arreglo[i]<<endl;
}
}

void append(int arreglo[],int tam, int opcion){
    int i;
    cout<<"" <<endl;
    for(i=0; i<5; i++){
    }
    cout<<"Ingrese un valor en la Posicion ["<<5<<"]:"<<endl;
    cin>>arreglo[5];
    cout<<""<<endl;
    for(i=0; i<tam; i++){
    cout<<"Posicion["<<i<<"] = "<<arreglo[i]<<endl;
}
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void clear_num(int arreglo[], int tam){
    int i;
    for(i=0; i<1; i++){
    array<int, 5 > arreglo {};
    arreglo.fill(0);
    cout<<""<<endl;
    cout<<""<<endl;
    cout<<" LISTA VACIA: "<<endl;
    cout << "| ";
    for (const auto &item : arreglo) {
        cout << item << " | ";
    }
    cout<<""<<endl;
    }
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();

}

void extend(int arreglo[], int tam){
    int n,m;
    cout<<" I N G R E S E    5    N U M E R O S: "<<endl;
    cout<<"" <<endl;
    int A[5],B[5];
    cout<<"Ingrese los valores de la PRIMERA LISTA:  \n";
    for(int i=0;i<5;i++){
        cout<<"Ingrese el numero "<<i+1<<": "<<endl;
        cin>>A[i];
        cout<<"" <<endl;
    }
    cout<<"Ingrese los valores de la SEGUNDA LISTA: \n";
    for(int i=0;i<5;i++){
        cout<<"Ingrese el numero "<<i+1<<": "<<endl;
        cin>>B[i];
    }
    int e=0,C[5+5];
    for(int i=0;i<5;i++){
        C[i]=A[i];
        e++;
    }
    for(int j=0;j<5;j++){
        C[e]=B[j];
        e++;
    }
    cout<<"" <<endl;
    cout<<"La union de la primera y segunda lista es: \n";
    for(int i=0;i<(5+5);i++){
        cout<<C[i]<<endl;
    }
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void count_num(int arreglo[], int tam, int numero, int contador){
    cout<<" I N G R E S E    5    N U M E R O S: "<<endl;
    for(int i=0; i<5; i++)
    {
    cout<<"Ingrese el numero "<<i+1<<": "<<endl;
    cin>>arreglo[i];
    }
    cout<<"Ingrese el numero a buscar: "<<endl;
    cin>>numero;
    for(int i=0;i<5;i++)
    {
        if(arreglo[i]==numero)
        {
        contador++;
        }
    }
    if(contador>0)
    {
    cout<<"El numero se repite "<<contador<<" veces."<< endl;
    }
    else
    {
    cout<<"El numero "<<numero<<" no existe en el arreglo."<< endl;
    }
    cout<<""<<endl;
cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void index(int arreglo[], int tam){
	int i, num, pos;
	int encontrado = 0;
    arreglo[i]=num;
	cout<<endl;
	cout << "Escoja cualquier numero:"<<endl;
    cin >> pos;
    cout << endl;
    for ( i=0; i<5; i++ ){
    if (arreglo[i]==pos)	{
    cout << "Encontrado en la "<< "Posicion [" << i << "] " << endl;
    encontrado = 1;
        }
    }
    if (encontrado==0){
    cout<<"El numero que ingreso No se encuentra en el vector"<< endl;
    }
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void insert_num(int arreglo[], int tam, int opcion){
    int posicion,valor_nueva;
	cout<<"\n";
	cout<<endl;
	cout<<"Ingrese la posicion a editar : "; cin>>posicion;
	cout<<"Ingrese el nuevo valor: "; cin>>valor_nueva;
	for(int i=(6-1);i>posicion;i--){
		arreglo[i]=arreglo[i-1];
	}
	arreglo[posicion]=valor_nueva;
	for(int i=0;i<6;i++){
		cout<<arreglo[i]<<" ";
	}
getch();
}

void pop(int arreglo[], int tam){
    int n,pos;
    int i;
    cout<<"\n Ingrese la posicion a eliminar"<<endl;
    cin>>pos;
    cout<<"" <<endl;
    int eliminado=arreglo[pos];
    for(int i=0;i<4;i++){
    if(i==pos){
    while(i<5-1){
    arreglo[i]=arreglo[i+1];
    i++;
   }
   break;
  }
 }
    n=n-1;
    for(int i=0;i<4;i++){
    cout<<"Los elementos del arreglo son "<<i<<" = "<<arreglo[i]<<endl;
 }
    cout<<"" <<endl;
    cout<<"El elemento eliminado es : "<<eliminado;
    cout<<"" <<endl;
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void remove_num(int arreglo[], int tam){
    int pos;
    int i;
    cout<<"\nIngrese la posicion a eliminar:"<<endl;
    cin>>pos;
    cout<<"" <<endl;
    int eliminado=arreglo[pos];
    for(int i=0;i<4;i++){
    if(i==pos){
    while(i<5-1){
    arreglo[i]=arreglo[i+1];
    i++;
   }
    break;
  }
 }
    cout<<"L I S T A:"<<endl;
    for(int i=0;i<4;i++){
    cout<<"Posicion ["<<i<<"]= "<<arreglo[i]<<endl;
 }
    cout<<"" <<endl;
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void reverse_num(int arreglo[], int tam,int n,int i){
    int a[50],b[50];
    cout<<"" <<endl;
    for(i=0;i<5;i++)
    {cout<<"Ingrese el numero "<<i+1<<": "<<endl;
    cin>>a[i];
}
    for(i=0;i<5;i++)
    b[i]=a[5-(i+1)];
    cout<<"La lista invertida es:";
    for(i=0;i<5;i++)
    cout<<" "<<b[i];
    cout<<"" <<endl;
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}

void sort_num(int arreglo[], int tam, int i, int j, int aux){
    for (i=0;i<5;i++)
    {
    cout<<"" <<endl;
    cout<<"Ingrese el numero "<<i+1<<": "<<endl;
    cin>>arreglo[i];
    }
    for(i=0;i<5;i++)
    {
    for(j=i+1;j<5;j++)
        {
    if(arreglo[i]>arreglo[j])
            {
    aux=arreglo[i];
    arreglo[i]=arreglo[j];
    arreglo[j]=aux;
            }
        }
    }
    cout<<"" <<endl;
    cout<<" \nLista ordenada de menor a mayor: " ;
    for(i=0;i<5;i++)
    {
    cout<<arreglo[i]<<" , ";
    }
    cout<<"" <<endl;
    cout<<""<<endl;
    cout<<"       Presione cualquier tecla para regresar al menu de inicio"<<endl;
getch();
}


