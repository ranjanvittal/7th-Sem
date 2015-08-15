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
public void micro_Init(int variable4, int variable5, boolean variable6, extra_boolean return_value) {
int micro_v_Age;
int micro_v_Salary;
boolean micro_v_Married;
micro_v_Age = variable4;
micro_v_Salary = variable5;
micro_v_Married = variable6;
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
public void micro_Equal(micro_Element variable7, extra_boolean return_value) {
micro_Element micro_other;
boolean micro_ret_val;
int micro_aux01;
int micro_aux02;
int micro_nt;
micro_Element variable8;
extra_int variable9;
int variable10;
micro_Element variable11;
extra_boolean variable12;
boolean variable13;
micro_Element variable14;
extra_int variable15;
int variable16;
micro_Element variable17;
extra_boolean variable18;
boolean variable19;
micro_Element variable20;
extra_boolean variable21;
boolean variable22;
micro_Element variable23;
extra_boolean variable24;
boolean variable25;
micro_other = variable7;
micro_ret_val = true;
variable8 = micro_other;
variable9 = new extra_int();
variable8.micro_GetAge(variable9);
variable10 = variable9.first;
micro_aux01 = variable10;
variable11 = this;
variable12 = new extra_boolean();
variable11.micro_Compare(micro_aux01,  micro_Age, variable12);
variable13 = variable12.first;
if(!variable13){
micro_ret_val = false;
}
else {
{
variable14 = micro_other;
variable15 = new extra_int();
variable14.micro_GetSalary(variable15);
variable16 = variable15.first;
micro_aux02 = variable16;
variable17 = this;
variable18 = new extra_boolean();
variable17.micro_Compare(micro_aux02,  micro_Salary, variable18);
variable19 = variable18.first;
if(!variable19){
micro_ret_val = false;
}
else {
if(micro_Married){
variable20 = micro_other;
variable21 = new extra_boolean();
variable20.micro_GetMarried(variable21);
variable22 = variable21.first;
if(!variable22){
micro_ret_val = false;
}
else {
micro_nt = 0;
}
}
else {
variable23 = micro_other;
variable24 = new extra_boolean();
variable23.micro_GetMarried(variable24);
variable25 = variable24.first;
if(variable25){
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
public void micro_Compare(int variable26, int variable27, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_retval;
int micro_aux02;
micro_num1 = variable26;
micro_num2 = variable27;
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
public void micro_InitNew(micro_Element variable28, micro_List variable29, boolean variable30, extra_boolean return_value) {
micro_Element micro_v_elem;
micro_List micro_v_next;
boolean micro_v_end;
micro_v_elem = variable28;
micro_v_next = variable29;
micro_v_end = variable30;
micro_end = micro_v_end;
micro_elem = micro_v_elem;
micro_next = micro_v_next;
return_value.first = true;
}
public void micro_Insert(micro_Element variable31, extra_micro_List return_value) {
micro_Element micro_new_elem;
boolean micro_ret_val;
micro_List micro_aux03;
micro_List micro_aux02;
micro_List variable32;
extra_boolean variable33;
boolean variable34;
micro_new_elem = variable31;
micro_aux03 = this;
micro_aux02 = new micro_List();
variable32 = micro_aux02;
variable33 = new extra_boolean();
variable32.micro_InitNew(micro_new_elem,  micro_aux03,  false, variable33);
variable34 = variable33.first;
micro_ret_val = variable34;
return_value.first = micro_aux02;
}
public void micro_SetNext(micro_List variable35, extra_boolean return_value) {
micro_List micro_v_next;
micro_v_next = variable35;
micro_next = micro_v_next;
return_value.first = true;
}
public void micro_Delete(micro_Element variable36, extra_micro_List return_value) {
micro_Element micro_e;
micro_List micro_my_head;
boolean micro_ret_val;
boolean micro_aux05;
micro_List micro_aux01;
micro_List micro_prev;
boolean micro_var_end;
micro_Element micro_var_elem;
int micro_aux04;
int micro_nt;
micro_Element variable37;
extra_boolean variable38;
boolean variable39;
micro_List variable40;
extra_micro_List variable41;
micro_List variable42;
micro_List variable43;
micro_List variable44;
extra_micro_List variable45;
micro_List variable46;
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
micro_e = variable36;
micro_my_head = this;
micro_ret_val = false;
micro_aux04 = 0-1;
micro_aux01 = this;
micro_prev = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while((!micro_var_end)&(!micro_ret_val)){
{
variable37 = micro_e;
variable38 = new extra_boolean();
variable37.micro_Equal(micro_var_elem, variable38);
variable39 = variable38.first;
if(variable39){
{
micro_ret_val = true;
if(micro_aux04<0){
{
variable40 = micro_aux01;
variable41 = new extra_micro_List();
variable40.micro_GetNext(variable41);
variable42 = variable41.first;
micro_my_head = variable42;
}
}
else {
{
System.out.println(0-555);
variable43 = micro_prev;
variable44 = micro_aux01;
variable45 = new extra_micro_List();
variable44.micro_GetNext(variable45);
variable46 = variable45.first;
variable47 = new extra_boolean();
variable43.micro_SetNext(variable46, variable47);
variable48 = variable47.first;
micro_aux05 = variable48;
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
public void micro_Search(micro_Element variable58, extra_int return_value) {
micro_Element micro_e;
int micro_int_ret_val;
micro_List micro_aux01;
micro_Element micro_var_elem;
boolean micro_var_end;
int micro_nt;
micro_Element variable59;
extra_boolean variable60;
boolean variable61;
micro_List variable62;
extra_micro_List variable63;
micro_List variable64;
micro_List variable65;
extra_boolean variable66;
boolean variable67;
micro_List variable68;
extra_micro_Element variable69;
micro_Element variable70;
micro_e = variable58;
micro_int_ret_val = 0;
micro_aux01 = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while(!micro_var_end){
{
variable59 = micro_e;
variable60 = new extra_boolean();
variable59.micro_Equal(micro_var_elem, variable60);
variable61 = variable60.first;
if(variable61){
{
micro_int_ret_val = 1;
}
}
else {
micro_nt = 0;
}
variable62 = micro_aux01;
variable63 = new extra_micro_List();
variable62.micro_GetNext(variable63);
variable64 = variable63.first;
micro_aux01 = variable64;
variable65 = micro_aux01;
variable66 = new extra_boolean();
variable65.micro_GetEnd(variable66);
variable67 = variable66.first;
micro_var_end = variable67;
variable68 = micro_aux01;
variable69 = new extra_micro_Element();
variable68.micro_GetElem(variable69);
variable70 = variable69.first;
micro_var_elem = variable70;
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
micro_Element variable71;
extra_int variable72;
int variable73;
micro_List variable74;
extra_micro_List variable75;
micro_List variable76;
micro_List variable77;
extra_boolean variable78;
boolean variable79;
micro_List variable80;
extra_micro_Element variable81;
micro_Element variable82;
micro_aux01 = this;
micro_var_end = micro_end;
micro_var_elem = micro_elem;
while(!micro_var_end){
{
variable71 = micro_var_elem;
variable72 = new extra_int();
variable71.micro_GetAge(variable72);
variable73 = variable72.first;
System.out.println(variable73);
variable74 = micro_aux01;
variable75 = new extra_micro_List();
variable74.micro_GetNext(variable75);
variable76 = variable75.first;
micro_aux01 = variable76;
variable77 = micro_aux01;
variable78 = new extra_boolean();
variable77.micro_GetEnd(variable78);
variable79 = variable78.first;
micro_var_end = variable79;
variable80 = micro_aux01;
variable81 = new extra_micro_Element();
variable80.micro_GetElem(variable81);
variable82 = variable81.first;
micro_var_elem = variable82;
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
micro_List variable83;
extra_boolean variable84;
boolean variable85;
micro_List variable86;
extra_boolean variable87;
boolean variable88;
micro_List variable89;
extra_boolean variable90;
boolean variable91;
micro_Element variable92;
extra_boolean variable93;
boolean variable94;
micro_List variable95;
extra_micro_List variable96;
micro_List variable97;
micro_List variable98;
extra_boolean variable99;
boolean variable100;
micro_Element variable101;
extra_boolean variable102;
boolean variable103;
micro_List variable104;
extra_micro_List variable105;
micro_List variable106;
micro_List variable107;
extra_boolean variable108;
boolean variable109;
micro_Element variable110;
extra_boolean variable111;
boolean variable112;
micro_List variable113;
extra_micro_List variable114;
micro_List variable115;
micro_List variable116;
extra_boolean variable117;
boolean variable118;
micro_Element variable119;
extra_boolean variable120;
boolean variable121;
micro_List variable122;
extra_int variable123;
int variable124;
micro_List variable125;
extra_int variable126;
int variable127;
micro_Element variable128;
extra_boolean variable129;
boolean variable130;
micro_List variable131;
extra_micro_List variable132;
micro_List variable133;
micro_List variable134;
extra_boolean variable135;
boolean variable136;
micro_List variable137;
extra_micro_List variable138;
micro_List variable139;
micro_List variable140;
extra_boolean variable141;
boolean variable142;
micro_List variable143;
extra_micro_List variable144;
micro_List variable145;
micro_List variable146;
extra_boolean variable147;
boolean variable148;
micro_last_elem = new micro_List();
variable83 = micro_last_elem;
variable84 = new extra_boolean();
variable83.micro_Init(variable84);
variable85 = variable84.first;
micro_aux01 = variable85;
micro_head = micro_last_elem;
variable86 = micro_head;
variable87 = new extra_boolean();
variable86.micro_Init(variable87);
variable88 = variable87.first;
micro_aux01 = variable88;
variable89 = micro_head;
variable90 = new extra_boolean();
variable89.micro_Print(variable90);
variable91 = variable90.first;
micro_aux01 = variable91;
micro_el01 = new micro_Element();
variable92 = micro_el01;
variable93 = new extra_boolean();
variable92.micro_Init(25,  37000,  false, variable93);
variable94 = variable93.first;
micro_aux01 = variable94;
variable95 = micro_head;
variable96 = new extra_micro_List();
variable95.micro_Insert(micro_el01, variable96);
variable97 = variable96.first;
micro_head = variable97;
variable98 = micro_head;
variable99 = new extra_boolean();
variable98.micro_Print(variable99);
variable100 = variable99.first;
micro_aux01 = variable100;
System.out.println(10000000);
micro_el01 = new micro_Element();
variable101 = micro_el01;
variable102 = new extra_boolean();
variable101.micro_Init(39,  42000,  true, variable102);
variable103 = variable102.first;
micro_aux01 = variable103;
micro_el02 = micro_el01;
variable104 = micro_head;
variable105 = new extra_micro_List();
variable104.micro_Insert(micro_el01, variable105);
variable106 = variable105.first;
micro_head = variable106;
variable107 = micro_head;
variable108 = new extra_boolean();
variable107.micro_Print(variable108);
variable109 = variable108.first;
micro_aux01 = variable109;
System.out.println(10000000);
micro_el01 = new micro_Element();
variable110 = micro_el01;
variable111 = new extra_boolean();
variable110.micro_Init(22,  34000,  false, variable111);
variable112 = variable111.first;
micro_aux01 = variable112;
variable113 = micro_head;
variable114 = new extra_micro_List();
variable113.micro_Insert(micro_el01, variable114);
variable115 = variable114.first;
micro_head = variable115;
variable116 = micro_head;
variable117 = new extra_boolean();
variable116.micro_Print(variable117);
variable118 = variable117.first;
micro_aux01 = variable118;
micro_el03 = new micro_Element();
variable119 = micro_el03;
variable120 = new extra_boolean();
variable119.micro_Init(27,  34000,  false, variable120);
variable121 = variable120.first;
micro_aux01 = variable121;
variable122 = micro_head;
variable123 = new extra_int();
variable122.micro_Search(micro_el02, variable123);
variable124 = variable123.first;
System.out.println(variable124);
variable125 = micro_head;
variable126 = new extra_int();
variable125.micro_Search(micro_el03, variable126);
variable127 = variable126.first;
System.out.println(variable127);
System.out.println(10000000);
micro_el01 = new micro_Element();
variable128 = micro_el01;
variable129 = new extra_boolean();
variable128.micro_Init(28,  35000,  false, variable129);
variable130 = variable129.first;
micro_aux01 = variable130;
variable131 = micro_head;
variable132 = new extra_micro_List();
variable131.micro_Insert(micro_el01, variable132);
variable133 = variable132.first;
micro_head = variable133;
variable134 = micro_head;
variable135 = new extra_boolean();
variable134.micro_Print(variable135);
variable136 = variable135.first;
micro_aux01 = variable136;
System.out.println(2220000);
variable137 = micro_head;
variable138 = new extra_micro_List();
variable137.micro_Delete(micro_el02, variable138);
variable139 = variable138.first;
micro_head = variable139;
variable140 = micro_head;
variable141 = new extra_boolean();
variable140.micro_Print(variable141);
variable142 = variable141.first;
micro_aux01 = variable142;
System.out.println(33300000);
variable143 = micro_head;
variable144 = new extra_micro_List();
variable143.micro_Delete(micro_el01, variable144);
variable145 = variable144.first;
micro_head = variable145;
variable146 = micro_head;
variable147 = new extra_boolean();
variable146.micro_Print(variable147);
variable148 = variable147.first;
micro_aux01 = variable148;
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

