#include <stdio.h>
#include <iostream>
#include <string.h>
#include <fstream>
#define dim 22
#define dim2 15
#define dim3 4
#define dim4 5
#define dim5 3

using namespace std;

struct alumno{
    long int cedula;
    char nombre[dim];
    int edad;
};//definicion de la estructura
struct materia{
 int cod_mat;
 char nombre[15];
 float nota[dim3];
 int num_creditos;
};
struct matricula{
  int cod_mat;
  alumno datos_alumno;
  materia datos_materia[dim4];
  double valor;
};
void validar_edad(int *x){
  while(*x<18||*x>60)
    {
     printf("Edad no valida ingrese de nuevo: ");
     scanf("%d",x);
    }
}
void validar_cedula1(long int *x){

   while(*x<100000000 || *x>10000000000)
    {
        printf("Error cedula no tiene los numeros necesarios ingrese de nuevo la cedula:");
        scanf("%ld",x);
    }
}
int validar_cedula2(long int x,int y){

  long int coc;
  int z[10];
  int i,mul,sumpar=0,sumimpar=0,sumtotal=0,res,valor;

    for(i=9;i>=0;i--)
   {
        coc=x/10;
        z[i]=x%10;
        x=coc;
   }

   for(int i=0;i<10;i+=2){

        mul=z[i]*2;
        if(mul>9)
            mul-=9;
        sumpar+=mul;

   }
    for(int i=1;i<10-1;i+=2){
     sumimpar+=z[i];}

    sumtotal=sumpar+sumimpar;
    coc=sumtotal/10;
    res=sumtotal%10;
    valor=10-res;

    if(valor==10)
        valor=0;

     if(valor==z[9])
          y=1;
      else
          y=0;
return(y);
}
int validar_creditos(int x){
   while(x<1||x>10)
    {
    printf("Numero de creditos no validos,ingrese los creditos: ");
    scanf("%d",&x);
    }
    return(x);
}
float validar_notas(float x){
  while(x<0||x>20)
  {
    printf("Nota invalida, ingrese de nuevo: ");
    scanf("%f",&x);
  }
  return(x);
}
matricula cedula(matricula x,matricula y){
int ce=1;
printf("\nIngrese la cedula del alumno: ");
    scanf("%ld",&x.datos_alumno.cedula);
    validar_cedula1(&x.datos_alumno.cedula);
    ce=validar_cedula2(x.datos_alumno.cedula,ce);

    while(ce==0){
    printf("\nIngrese la cedula del alumno: ");
    scanf("%ld",&x.datos_alumno.cedula);
    validar_cedula1(&x.datos_alumno.cedula);
    ce=validar_cedula2(x.datos_alumno.cedula,ce);
    }
    return(x);
}

matricula ingresar(matricula x,int y,long int ced){
    char *a="ES";
    char *b="PE";
    float acum;
    int ce,z;
    z=y-1;
    ce=1;
    printf("\n");
    printf("\n||| Ingreso de datos matricula %d|||",y);
    printf("\n");
    x.cod_mat=y*1111;
    printf(" --Codigo de matricula %s%d%s--\n",a,x.cod_mat,b);
    printf("\n");
    printf("|||Ingreso de datos estudiante|||\n");
    x.datos_alumno.cedula=ced;
    printf("Cedula: %ld",x.datos_alumno.cedula);
    fflush(stdin);
    printf("\nIngrese el nombre del alumno: ");
    gets(x.datos_alumno.nombre);
    printf("\nIngrese la edad del alumno: ");
    scanf("%d",&x.datos_alumno.edad);
    validar_edad(&x.datos_alumno.edad);
    printf("\n");
    x.valor=0;
    printf("|||Ingreso de datos materias|||\n");
    char *c="MA";
    char *d="RI";
  for (int i=0;i<3;i++)
    {
      fflush(stdin);
      x.datos_materia[i].cod_mat=(z+111);
      z= x.datos_materia[i].cod_mat;
      printf("\nCodigo de la materia %s%d%s",c,x.datos_materia[i].cod_mat,d);
      //*x.datos_materia[i].cod_mat=validar_materia(x.datos_materia[i].cod_mat);
      fflush(stdin);
      printf("\nIngrese el nombre de la materia: ");
      gets(x.datos_materia[i].nombre);
      printf("\nIngrese el numero de creditos: ");
      scanf("%d",&x.datos_materia[i].num_creditos);
      x.datos_materia[i].num_creditos=validar_creditos(x.datos_materia[i].num_creditos);
      x.valor+=x.datos_materia[i].num_creditos*15;
      printf("\n||| Ingrese las notas |||");
        acum=0;
        for(int j=0; j<3;j++)
    {
          printf("\n Ingrese la nota %d: ",j+1);
          scanf("%f",&x.datos_materia[i].nota[j]);
          x.datos_materia[i].nota[j]=validar_notas(x.datos_materia[i].nota[j]);
          acum+= x.datos_materia[i].nota[j];
    }
        x.datos_materia[i].nota[3]=acum;
      printf("\n");
    }

    return(x);

}
void guardar(matricula x, int num){
    ofstream archivo;
    char ab[10];
    char aa[5]=".txt";
    sprintf(ab, "%d",num);
    fflush(stdin);
    strcat(ab,aa);
    fflush(stdin);
    archivo.open(ab,ios::out);//Abriendo el archivo
    char *a="ES";
    char *b="PE";
    char *z=("||||Matricula||||\n");
    archivo<<z;
    char *y=("Codigo matricula: ");
    char xx[10];
    sprintf(xx, "%d", x.cod_mat);
    archivo<<y;
    archivo<<a;
    archivo<<xx;
    archivo<<b<<endl;
    char *w=("|||Informacion estudiante|||");
    archivo<<w;
    char *v=("\nCedula: ");
    char xy[10];
    sprintf(xy, "%d", x.datos_alumno.cedula);
    archivo<<v;
    archivo<<xy;
    char *u=("\nNombre: ");
    archivo<<u;
    char *xz=(x.datos_alumno.nombre);
    archivo<<xz;
    char *t=("\nEdad: ");
    char xa[10];
    sprintf(xa, "%d", x.datos_alumno.edad);
    archivo<<t;
    archivo<<xa;
    char *s=("\n|||Informacion materias|||");
    archivo<<s;
    char *c="MA";
    char *d="RI";
  for (int i=0;i<3;i++)
    {
    char *r=("\nCodigo materia:");
    char xb[10];
    sprintf(xb, "%d", x.datos_materia[i].cod_mat);
    archivo<<r;
    archivo<<c;
    archivo<<xb;
    archivo<<d;
    char *q=("\nNombre materia: ");
    char *xc=(x.datos_materia[i].nombre);
    archivo<<q;
    archivo<<xc;
    char *p=("\nEl numero de creditos: ");
    char xv[10];
    sprintf(xv, "%d", x.datos_materia[i].num_creditos);
    archivo<<p;
    archivo<<xv;
     for(int j=0; j<3;j++)
    {
    char *o=("\nLa nota es: ");
    char xn[10];
    sprintf(xn, "%f", x.datos_materia[i].nota[j]);
    archivo<<o;
    archivo<<xn;
    }
    char *n=("\nNota final: ");
    char xm[10];
    sprintf(xm, "%f", x.datos_materia[i].nota[3]);
    archivo<<n;
    archivo<<xm;
    if(x.datos_materia[i].nota[3]>=42)
        archivo<<("\nMateria aprobada");

    else
        archivo<<("\nMateria reprobada");

    }
    archivo<<("\nEl valor a pagar es: ");
    char xl[10];
    sprintf(xl, "%f", x.valor);
    archivo<<xl;
    archivo<<("$");

    archivo.close();//Cerrar el archivo

}
void imprimir (matricula x){
    char *a="ES";
    char *b="PE";
    printf("\n");
    printf("||||Matricula||||\n");
    printf("Codigo matricula: %s%d%s\n",a,x.cod_mat,b);
    printf("\n");
    printf("|||Informacion estudiante|||");
    printf("\nCedula: %ld",x.datos_alumno.cedula);
    printf("\nNombre: ");
    puts(x.datos_alumno.nombre);
    printf("Edad: %d\n",x.datos_alumno.edad);
    printf("\n");
    printf("|||Informacion materias|||");
    char *c="MA";
    char *d="RI";
  for (int i=0;i<3;i++)
    {
    printf("\nCodigo materia: %s%d%s",c,x.datos_materia[i].cod_mat,d);
    printf("\nNombre materia: ");
    puts(x.datos_materia[i].nombre);
    printf("El numero de creditos: %d",x.datos_materia[i].num_creditos);
     for(int j=0; j<3;j++)
    {
     printf("\nLa nota %d es: %.2f ",j+1,x.datos_materia[i].nota[j]);
    }
    printf("\nNota final: %.2f",x.datos_materia[i].nota[3]);
    if(x.datos_materia[i].nota[3]>=42)
        printf("\nMateria aprobada");
    else
        printf("\nMateria reprobada");
    printf("\n");
    }
    printf("\nEl valor a pagar es: %.2f$",x.valor);
     printf("\n");
}
void lectura(int x){
 x=1;
 ifstream archivo;
 char y [5]=".txt";
 string dato;
 char z [3]="1";

 archivo.open("1.txt");// buscar diferentes archivos
 if(!archivo)
 cout << "Error abriendo el fichero" << endl;
 else
 {
 for(int i = 0; i < 101; i++)
 {
 archivo >> dato;
 cout << dato <<ends;

 }
 }
 archivo.close();
}
void opciones(){
  printf("\n   +++SISTEMA DE MATRICULAS+++");
  printf("\n|||||||||||||||||||||||||||||||||");
  printf("\n1. Matricula nueva");
  printf("\n2. Modificar una matricula");
  printf("\n3. Eliminar matricula");
  printf("\n4. Buscar matricula");
  printf("\n5. Salir");
  printf("\n|||||||||||||||||||||||||||||||||");
}
int elegir(int a){

 printf("\nIngrese la opcion que usted desee:  ");
  scanf("%d",&a);

return(a);
}
void incedula(long int *x){
    int ce;
    ce=1;
    printf("\nIngrese la cedula: ");
    scanf("%ld",x);
    validar_cedula1(x);
    ce=validar_cedula2(*x,ce);
    while(ce==0){
    printf("\nIngrese la cedula: ");
    scanf("%ld",x);
    validar_cedula1(x);
    ce=validar_cedula2(*x,ce);
    }
}
void comp(long int x,int *y,matricula a,int *b,int z){

  if(x==a.datos_alumno.cedula){
    *y=0;
    *b=z;}

}
void opciones1(){
  printf("\n|||||||||||||||||||||||||||||||||");
  printf("\n1. Nombre de alumno");
  printf("\n2. Edad del alumno");
  printf("\n3. Nombre de materia");
  printf("\n4. Numero de creditos");
  printf("\n5. Salir");
  printf("\n|||||||||||||||||||||||||||||||||");
}
matricula nom_alum(matricula x){

    fflush(stdin);
    printf("\nIngrese el nombre del alumno: ");
    gets(x.datos_alumno.nombre);

return(x);
}
matricula edad_alum(matricula x){

    printf("\nIngrese la edad del alumno: ");
    scanf("%d",&x.datos_alumno.edad);
    validar_edad(&x.datos_alumno.edad);

    return(x);
}
void opciones2(matricula x){
  printf("\n|||||||||||||||||||||||||||||||||");
  printf("\n1. Materia %s cambiar nombre",x.datos_materia[0].nombre);
  printf("\n2. Materia %s cambiar nombre",x.datos_materia[1].nombre);
  printf("\n3. Materia %s cambiar nombre",x.datos_materia[2].nombre);
  printf("\n4. Salir");
  printf("\n|||||||||||||||||||||||||||||||||");
}
matricula nom_materia(matricula x,int y){

    fflush(stdin);
    printf("\nIngrese el nombre de la materia: ");
    gets(x.datos_materia[y].nombre);

    return(x);
}
matricula cre_materia(matricula x){

    for (int i=0;i<3;i++){
    fflush(stdin);
    printf("\nIngrese el numero de creditos de la materia ");
    puts(x.datos_materia[i].nombre);
    scanf("%d",&x.datos_materia[i].num_creditos);
    x.datos_materia[i].num_creditos=validar_creditos(x.datos_materia[i].num_creditos);
    x.valor+=x.datos_materia[i].num_creditos*15;
    }
    return(x);

}
void ingreso2(){
 printf("\n|||||||||||||||||||||");
 printf("\n|||Matricula nueva|||");
 printf("\n|||||||||||||||||||||");
}
matricula eli_cedula(matricula x){

   printf("\n||||Matricula eliminada||||\n");
   x.datos_alumno.cedula=0;

return(x);
}
void opcion26(){

printf("\n   +++SISTEMA DE MATRICULAS+++");
printf("\n|||||||||||||||||||||||||||||||||");
printf("\n1. Matricula nueva");
printf("\n2. Salir");
printf("\n|||||||||||||||||||||||||||||||||");



}

int main()
{
    matricula e1[dim4];//declaracion de una variable del tipo matricula
    int opcion,x,y;
    long int ced;
    x=1;
    y=0;
    opcion26();
    opcion=elegir(opcion);
    switch(opcion){

      case 1:
         incedula(&ced);
         e1[y]=ingresar(e1[y],x,ced);//ingresar
                     //(&e1[y],x);//direccion de e1 direccion materia
                guardar(e1[y],x);
          y++;
          x++;
      break;
      case 2:
        return (1);

      break;
    }
    do{
    opciones();
    opcion=elegir(opcion);
    switch(opcion){

      case 1:
          int bus,bus2;
          bus=2;
          bus2=1;
          if(y<dim4){
          incedula(&ced);
           for(int i=0;i<dim4;i++){
          comp(ced,&bus,e1[i],&bus2,i);
          }
         if(bus==2){
         e1[y]=ingresar(e1[y],x,ced);//ingresar
                guardar(e1[y],x);
          y++;
          x++;}
          else
          printf("\n|||Cedula existente|||\n");
          }
          else
          printf("\n|||Base llena , no se puede ingresar mas matriculas|||\n");
      break;
      case 2:
          int ele;
          bus=2;
          bus2=1;
          incedula(&ced);
           for(int i=0;i<dim4;i++){
          comp(ced,&bus,e1[i],&bus2,i);
          }
          if(bus==0){
          do{
                opciones1();
                ele=elegir(ele);
                switch(ele){

                   case 1:
                       e1[bus2]=nom_alum(e1[bus2]);
                       guardar(e1[bus2],bus2+1);
                   break;
                   case 2:
                       e1[bus2]=edad_alum(e1[bus2]);
                       guardar(e1[bus2],bus2+1);
                   break;
                   case 3:
                       int n;
                       n=0;
                       do{
                       opciones2(e1[bus2]);
                       n=elegir(n);
                       switch(n){
                          case 1:
                          int num_m;
                          num_m=0;
                          e1[bus2]=nom_materia(e1[bus2],num_m);
                          guardar(e1[bus2],bus2+1);
                          break;
                          case 2:
                          num_m=1;
                          e1[bus2]=nom_materia(e1[bus2],num_m);
                          guardar(e1[bus2],bus2+1);
                          break;
                          case 3:
                          num_m=2;
                          e1[bus2]=nom_materia(e1[bus2],num_m);
                          guardar(e1[bus2],bus2+1);
                          break;
                       }
                       }while(n<4);
                   break;
                   case 4:

                       e1[bus2]=cre_materia(e1[bus2]);
                       guardar(e1[bus2],bus2+1);

                   break;
                  }
                }while(ele<5);}
          else
            printf("\n---Estudiante no encontrado---\n");
      break;

      case 3:

          bus=1;
          bus2=0;
          incedula(&ced);
          for(int i=0;i<dim4;i++){
          comp(ced,&bus,e1[i],&bus2,i);
          }
          if(bus==0){
          e1[bus2]=eli_cedula(e1[bus2]);
          guardar(e1[bus2],bus2+1);}
          else
          printf("\n---Estudiante no encontrado---\n");

      break;
      case 4:
          bus=1;
          bus2=0;
          incedula(&ced);
          for(int i=0;i<dim4;i++){
          comp(ced,&bus,e1[i],&bus2,i);
          }
          if(bus==0){
          imprimir(e1[bus2]);
          //lectura(bus2);
          }
          else
          printf("\n---Estudiante no encontrado---\n");
      break;
        printf("No existen matriculas en el sistema ");
    }
    }while(opcion!=5);

    return 0;
}
