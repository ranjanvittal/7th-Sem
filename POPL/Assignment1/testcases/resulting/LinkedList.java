class LinkedList { public static void main ( String[] micro_a) {
new new_LinkedList().print();
}
}
class new_LinkedList {
public void print() {
micro_LL variable1;
extra_int variable2;
int variable3;
variable1 = new micro_LL();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Element {
int micro_Age;
int micro_Salary;
boolean micro_Married;
public void micro_Init(int micro_v_Age, int micro_v_Salary, boolean micro_v_Married, extra_boolean return_value) {
micro_Age = micro_v_Age;
micro_Salary = micro_v_Salary;
micro_Married = micro_v_Married;
return_value.first = true;
}
public void micro_GetAge(extra_int return_value) {
return_value.first = micro_Age;
}
public void micro_GetSalary(extra_int return_value) {
return_value.first = micro_Salary;
}
public void micro_GetMarried(extra_boolean return_value) {
return_value.first = micro_Married;
}
public void micro_Equal(micro_Element micro_other, extra_boolean return_value) {
boolean micro_ret_val;
int micro_aux01;
int micro_aux02;
int micro_nt;
micro_Element variable4;
extra_int variable5;
int variable6;
micro_Element variable7;
extra_boolean variable8;
boolean variable9;
micro_Element variable10;
extra_int variable11;
int variable12;
micro_Element variable13;
extra_boolean variable14;
boolean variable15;
micro_Element variable16;
extra_boolean variable17;
boolean variable18;
micro_Element variable19;
extra_boolean variable20;
boolean variable21;
micro_ret_val = true;
variable4 = micro_other;
variable5 = new extra_int();
variable4.micro_GetAge(variable5);
variable6 = variable5.first;
micro_aux01 = variable6;
variable7 = this;
variable8 = new extra_boolean();
variable7.micro_Compare(micro_aux01,  micro_Age, variable8);
variable9 = variable8.first;
if(!variable9){
micro_ret_val = false;
}
else {
{
variable10 = micro_other;
variable11 = new extra_int();
variable10.micro_GetSalary(variable11);
variable12 = variable11.first;
micro_aux02 = variable12;
variable13 = this;
variable14 = new extra_boolean();
variable13.micro_Compare(micro_aux02,  micro_Salary, variable14);
variable15 = variable14.first;
if(!variable15){
micro_ret_val = false;
}
else {
if(micro_Married){
variable16 = micro_other;
variable17 = new extra_boolean();
variable16.micro_GetMarried(variable17);
variable18 = variable17.first;
if(!variable18){
micro_ret_val = false;
}
else {
micro_nt = 0;
}
}
else {
variable19 = micro_other;
variable20 = new extra_boolean();
variable19.micro_GetMarried(variable20);
variable21 = variable20.first;
if(variable21){
micro_ret_val = false;
}
else {
micro_nt = 0;
}
}
}
}
}
return_value.first = micro_ret_val;
}
public void micro_Compare(int micro_num1, int micro_num2, extra_boolean return_value) {
boolean micro_retval;
int micro_aux02;
micro_retval = false;
micro_aux02 = micro_num2+1;
if(micro_num1<micro_num2){
micro_retval = false;
}
else {
if(!(micro_num1<micro_aux02)){
micro_retval = false;
}
else {
micro_retval = true;
}
}
return_value.first = micro_retval;
}
}
class micro_List {
micro_Element micro_elem;
micro_List micro_next;
boolean micro_end;
public void micro_Init(extra_boolean return_value) {
micro_end = true;
return_value.first = true;
}
public void micro_InitNew(micro_Element micro_v_elem, micro_List micro_v_next, boolean micro_v_end, extra_boolean return_value) {
micro_end = micro_v_end;
micro_elem = micro_v_elem;
micro_next = micro_v_next;
return_value.first = true;
}
public void micro_Insert(micro_Element micro_new_elem, extra_micro_List return_value) {
boolean micro_ret_val;
micro_List micro_aux03;
micro_List micro_aux02;
micro_List variable22;
extra_boolean variable23;
boolean variable24;
micro_aux03 = this;
micro_aux02 = new micro_List();
variable22 = micro_aux02;
variable23 = new extra_boolean();
variable22.micro_InitNew(micro_new_elem,  micro_aux03,  false, variable23);
variable24 = variable23.first;
micro_ret_val = variable24;
return_value.first = micro_aux02;
}
public void micro_SetNext(micro_List micro_v_next, extra_boolean return_value) {
micro_next = micro_v_next;
return_value.first = true;
}
public void micro_Delete(micro_Element micro_e, extra_micro_List return_value) {
micro_List micro_my_head;
boolean micro_ret_val;
boolean micro_aux05;
micro_List micro_aux01;
micro_List micro_prev;
boolean micro_var_end;
micro_Element micro_var_elem;
int micro_aux04;
int micro_nt;
micro_Element variable25;
extra_boolean variable26;
boolean variable27;
micro_List variable28;
extra_micro_List variable29;
micro_List variable30;
micro_List variable31;
micro_List variable32;
extra_micro_List variable33;
micro_List variable34;
extra_boolean variable35;
boolean variable36;
micro_List variable37;
extra_micro_List variable38;
micro_List variable39;
micro_List variable40;
extra_boolean variable41;
boolean variable42;
micro_List variable43;
extra_micro_Element variable44;
micro_Element variable45;
micro_my_head = this;
micro_ret_val = false;
micro_aux04 = 0-1;
micro_aux01 = this;
micro_prev = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while((!micro_var_end)&(!micro_ret_val)){
{
variable25 = micro_e;
variable26 = new extra_boolean();
variable25.micro_Equal(micro_var_elem, variable26);
variable27 = variable26.first;
if(variable27){
{
micro_ret_val = true;
if(micro_aux04<0){
{
variable28 = micro_aux01;
variable29 = new extra_micro_List();
variable28.micro_GetNext(variable29);
variable30 = variable29.first;
micro_my_head = variable30;
}
}
else {
{
System.out.println(0-555);
variable31 = micro_prev;
variable32 = micro_aux01;
variable33 = new extra_micro_List();
variable32.micro_GetNext(variable33);
variable34 = variable33.first;
variable35 = new extra_boolean();
variable31.micro_SetNext(variable34, variable35);
variable36 = variable35.first;
micro_aux05 = variable36;
System.out.println(0-555);
}
}
}
}
else {
micro_nt = 0;
}
if(!micro_ret_val){
{
micro_prev = micro_aux01;
variable37 = micro_aux01;
variable38 = new extra_micro_List();
variable37.micro_GetNext(variable38);
variable39 = variable38.first;
micro_aux01 = variable39;
variable40 = micro_aux01;
variable41 = new extra_boolean();
variable40.micro_GetEnd(variable41);
variable42 = variable41.first;
micro_var_end = variable42;
variable43 = micro_aux01;
variable44 = new extra_micro_Element();
variable43.micro_GetElem(variable44);
variable45 = variable44.first;
micro_var_elem = variable45;
micro_aux04 = 1;
}
}
else {
micro_nt = 0;
}
}
}
return_value.first = micro_my_head;
}
public void micro_Search(micro_Element micro_e, extra_int return_value) {
int micro_int_ret_val;
micro_List micro_aux01;
micro_Element micro_var_elem;
boolean micro_var_end;
int micro_nt;
micro_Element variable46;
extra_boolean variable47;
boolean variable48;
micro_List variable49;
extra_micro_List variable50;
micro_List variable51;
micro_List variable52;
extra_boolean variable53;
boolean variable54;
micro_List variable55;
extra_micro_Element variable56;
micro_Element variable57;
micro_int_ret_val = 0;
micro_aux01 = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while(!micro_var_end){
{
variable46 = micro_e;
variable47 = new extra_boolean();
variable46.micro_Equal(micro_var_elem, variable47);
variable48 = variable47.first;
if(variable48){
{
micro_int_ret_val = 1;
}
}
else {
micro_nt = 0;
}
variable49 = micro_aux01;
variable50 = new extra_micro_List();
variable49.micro_GetNext(variable50);
variable51 = variable50.first;
micro_aux01 = variable51;
variable52 = micro_aux01;
variable53 = new extra_boolean();
variable52.micro_GetEnd(variable53);
variable54 = variable53.first;
micro_var_end = variable54;
variable55 = micro_aux01;
variable56 = new extra_micro_Element();
variable55.micro_GetElem(variable56);
variable57 = variable56.first;
micro_var_elem = variable57;
}
}
return_value.first = micro_int_ret_val;
}
public void micro_GetEnd(extra_boolean return_value) {
return_value.first = micro_end;
}
public void micro_GetElem(extra_micro_Element return_value) {
return_value.first = micro_elem;
}
public void micro_GetNext(extra_micro_List return_value) {
return_value.first = micro_next;
}
public void micro_Print(extra_boolean return_value) {
micro_List micro_aux01;
boolean micro_var_end;
micro_Element micro_var_elem;
micro_Element variable58;
extra_int variable59;
int variable60;
micro_List variable61;
extra_micro_List variable62;
micro_List variable63;
micro_List variable64;
extra_boolean variable65;
boolean variable66;
micro_List variable67;
extra_micro_Element variable68;
micro_Element variable69;
micro_aux01 = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while(!micro_var_end){
{
variable58 = micro_var_elem;
variable59 = new extra_int();
variable58.micro_GetAge(variable59);
variable60 = variable59.first;
System.out.println(variable60);
variable61 = micro_aux01;
variable62 = new extra_micro_List();
variable61.micro_GetNext(variable62);
variable63 = variable62.first;
micro_aux01 = variable63;
variable64 = micro_aux01;
variable65 = new extra_boolean();
variable64.micro_GetEnd(variable65);
variable66 = variable65.first;
micro_var_end = variable66;
variable67 = micro_aux01;
variable68 = new extra_micro_Element();
variable67.micro_GetElem(variable68);
variable69 = variable68.first;
micro_var_elem = variable69;
}
}
return_value.first = true;
}
}
class micro_LL {
public void micro_Start(extra_int return_value) {
micro_List micro_head;
micro_List micro_last_elem;
boolean micro_aux01;
micro_Element micro_el01;
micro_Element micro_el02;
micro_Element micro_el03;
micro_List variable70;
extra_boolean variable71;
boolean variable72;
micro_List variable73;
extra_boolean variable74;
boolean variable75;
micro_List variable76;
extra_boolean variable77;
boolean variable78;
micro_Element variable79;
extra_boolean variable80;
boolean variable81;
micro_List variable82;
extra_micro_List variable83;
micro_List variable84;
micro_List variable85;
extra_boolean variable86;
boolean variable87;
micro_Element variable88;
extra_boolean variable89;
boolean variable90;
micro_List variable91;
extra_micro_List variable92;
micro_List variable93;
micro_List variable94;
extra_boolean variable95;
boolean variable96;
micro_Element variable97;
extra_boolean variable98;
boolean variable99;
micro_List variable100;
extra_micro_List variable101;
micro_List variable102;
micro_List variable103;
extra_boolean variable104;
boolean variable105;
micro_Element variable106;
extra_boolean variable107;
boolean variable108;
micro_List variable109;
extra_int variable110;
int variable111;
micro_List variable112;
extra_int variable113;
int variable114;
micro_Element variable115;
extra_boolean variable116;
boolean variable117;
micro_List variable118;
extra_micro_List variable119;
micro_List variable120;
micro_List variable121;
extra_boolean variable122;
boolean variable123;
micro_List variable124;
extra_micro_List variable125;
micro_List variable126;
micro_List variable127;
extra_boolean variable128;
boolean variable129;
micro_List variable130;
extra_micro_List variable131;
micro_List variable132;
micro_List variable133;
extra_boolean variable134;
boolean variable135;
micro_last_elem = new micro_List();
variable70 = micro_last_elem;
variable71 = new extra_boolean();
variable70.micro_Init(variable71);
variable72 = variable71.first;
micro_aux01 = variable72;
micro_head = micro_last_elem;
variable73 = micro_head;
variable74 = new extra_boolean();
variable73.micro_Init(variable74);
variable75 = variable74.first;
micro_aux01 = variable75;
variable76 = micro_head;
variable77 = new extra_boolean();
variable76.micro_Print(variable77);
variable78 = variable77.first;
micro_aux01 = variable78;
micro_el01 = new micro_Element();
variable79 = micro_el01;
variable80 = new extra_boolean();
variable79.micro_Init(25,  37000,  false, variable80);
variable81 = variable80.first;
micro_aux01 = variable81;
variable82 = micro_head;
variable83 = new extra_micro_List();
variable82.micro_Insert(micro_el01, variable83);
variable84 = variable83.first;
micro_head = variable84;
variable85 = micro_head;
variable86 = new extra_boolean();
variable85.micro_Print(variable86);
variable87 = variable86.first;
micro_aux01 = variable87;
System.out.println(10000000);
micro_el01 = new micro_Element();
variable88 = micro_el01;
variable89 = new extra_boolean();
variable88.micro_Init(39,  42000,  true, variable89);
variable90 = variable89.first;
micro_aux01 = variable90;
micro_el02 = micro_el01;
variable91 = micro_head;
variable92 = new extra_micro_List();
variable91.micro_Insert(micro_el01, variable92);
variable93 = variable92.first;
micro_head = variable93;
variable94 = micro_head;
variable95 = new extra_boolean();
variable94.micro_Print(variable95);
variable96 = variable95.first;
micro_aux01 = variable96;
System.out.println(10000000);
micro_el01 = new micro_Element();
variable97 = micro_el01;
variable98 = new extra_boolean();
variable97.micro_Init(22,  34000,  false, variable98);
variable99 = variable98.first;
micro_aux01 = variable99;
variable100 = micro_head;
variable101 = new extra_micro_List();
variable100.micro_Insert(micro_el01, variable101);
variable102 = variable101.first;
micro_head = variable102;
variable103 = micro_head;
variable104 = new extra_boolean();
variable103.micro_Print(variable104);
variable105 = variable104.first;
micro_aux01 = variable105;
micro_el03 = new micro_Element();
variable106 = micro_el03;
variable107 = new extra_boolean();
variable106.micro_Init(27,  34000,  false, variable107);
variable108 = variable107.first;
micro_aux01 = variable108;
variable109 = micro_head;
variable110 = new extra_int();
variable109.micro_Search(micro_el02, variable110);
variable111 = variable110.first;
System.out.println(variable111);
variable112 = micro_head;
variable113 = new extra_int();
variable112.micro_Search(micro_el03, variable113);
variable114 = variable113.first;
System.out.println(variable114);
System.out.println(10000000);
micro_el01 = new micro_Element();
variable115 = micro_el01;
variable116 = new extra_boolean();
variable115.micro_Init(28,  35000,  false, variable116);
variable117 = variable116.first;
micro_aux01 = variable117;
variable118 = micro_head;
variable119 = new extra_micro_List();
variable118.micro_Insert(micro_el01, variable119);
variable120 = variable119.first;
micro_head = variable120;
variable121 = micro_head;
variable122 = new extra_boolean();
variable121.micro_Print(variable122);
variable123 = variable122.first;
micro_aux01 = variable123;
System.out.println(2220000);
variable124 = micro_head;
variable125 = new extra_micro_List();
variable124.micro_Delete(micro_el02, variable125);
variable126 = variable125.first;
micro_head = variable126;
variable127 = micro_head;
variable128 = new extra_boolean();
variable127.micro_Print(variable128);
variable129 = variable128.first;
micro_aux01 = variable129;
System.out.println(33300000);
variable130 = micro_head;
variable131 = new extra_micro_List();
variable130.micro_Delete(micro_el01, variable131);
variable132 = variable131.first;
micro_head = variable132;
variable133 = micro_head;
variable134 = new extra_boolean();
variable133.micro_Print(variable134);
variable135 = variable134.first;
micro_aux01 = variable135;
System.out.println(44440000);
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Element { micro_Element first;}
class extra_micro_List { micro_List first;}
class extra_micro_LL { micro_LL first;}

