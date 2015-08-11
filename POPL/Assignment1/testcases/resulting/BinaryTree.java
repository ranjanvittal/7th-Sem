class BinaryTree { public static void main ( String[] micro_a) {
new new_BinaryTree().print();
}
}
class new_BinaryTree {
public void print() {
micro_BT variable1;
extra_int variable2;
int variable3;
variable1 = new micro_BT();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_BT {
public void micro_Start(extra_int return_value) {
micro_Tree micro_root;
boolean micro_ntb;
int micro_nti;
micro_Tree variable4;
extra_boolean variable5;
boolean variable6;
micro_Tree variable7;
extra_boolean variable8;
boolean variable9;
micro_Tree variable10;
extra_boolean variable11;
boolean variable12;
micro_Tree variable13;
extra_boolean variable14;
boolean variable15;
micro_Tree variable16;
extra_boolean variable17;
boolean variable18;
micro_Tree variable19;
extra_boolean variable20;
boolean variable21;
micro_Tree variable22;
extra_boolean variable23;
boolean variable24;
micro_Tree variable25;
extra_boolean variable26;
boolean variable27;
micro_Tree variable28;
extra_boolean variable29;
boolean variable30;
micro_Tree variable31;
extra_boolean variable32;
boolean variable33;
micro_Tree variable34;
extra_boolean variable35;
boolean variable36;
micro_Tree variable37;
extra_int variable38;
int variable39;
micro_Tree variable40;
extra_int variable41;
int variable42;
micro_Tree variable43;
extra_int variable44;
int variable45;
micro_Tree variable46;
extra_int variable47;
int variable48;
micro_Tree variable49;
extra_int variable50;
int variable51;
micro_Tree variable52;
extra_boolean variable53;
boolean variable54;
micro_Tree variable55;
extra_boolean variable56;
boolean variable57;
micro_Tree variable58;
extra_int variable59;
int variable60;
micro_root = new micro_Tree();
variable4 = micro_root;
variable5 = new extra_boolean();
variable4.micro_Init(16, variable5);
variable6 = variable5.first;
micro_ntb = variable6;
variable7 = micro_root;
variable8 = new extra_boolean();
variable7.micro_Print(variable8);
variable9 = variable8.first;
micro_ntb = variable9;
System.out.println(100000000);
variable10 = micro_root;
variable11 = new extra_boolean();
variable10.micro_Insert(8, variable11);
variable12 = variable11.first;
micro_ntb = variable12;
variable13 = micro_root;
variable14 = new extra_boolean();
variable13.micro_Print(variable14);
variable15 = variable14.first;
micro_ntb = variable15;
variable16 = micro_root;
variable17 = new extra_boolean();
variable16.micro_Insert(24, variable17);
variable18 = variable17.first;
micro_ntb = variable18;
variable19 = micro_root;
variable20 = new extra_boolean();
variable19.micro_Insert(4, variable20);
variable21 = variable20.first;
micro_ntb = variable21;
variable22 = micro_root;
variable23 = new extra_boolean();
variable22.micro_Insert(12, variable23);
variable24 = variable23.first;
micro_ntb = variable24;
variable25 = micro_root;
variable26 = new extra_boolean();
variable25.micro_Insert(20, variable26);
variable27 = variable26.first;
micro_ntb = variable27;
variable28 = micro_root;
variable29 = new extra_boolean();
variable28.micro_Insert(28, variable29);
variable30 = variable29.first;
micro_ntb = variable30;
variable31 = micro_root;
variable32 = new extra_boolean();
variable31.micro_Insert(14, variable32);
variable33 = variable32.first;
micro_ntb = variable33;
variable34 = micro_root;
variable35 = new extra_boolean();
variable34.micro_Print(variable35);
variable36 = variable35.first;
micro_ntb = variable36;
variable37 = micro_root;
variable38 = new extra_int();
variable37.micro_Search(24, variable38);
variable39 = variable38.first;
System.out.println(variable39);
variable40 = micro_root;
variable41 = new extra_int();
variable40.micro_Search(12, variable41);
variable42 = variable41.first;
System.out.println(variable42);
variable43 = micro_root;
variable44 = new extra_int();
variable43.micro_Search(16, variable44);
variable45 = variable44.first;
System.out.println(variable45);
variable46 = micro_root;
variable47 = new extra_int();
variable46.micro_Search(50, variable47);
variable48 = variable47.first;
System.out.println(variable48);
variable49 = micro_root;
variable50 = new extra_int();
variable49.micro_Search(12, variable50);
variable51 = variable50.first;
System.out.println(variable51);
variable52 = micro_root;
variable53 = new extra_boolean();
variable52.micro_Delete(12, variable53);
variable54 = variable53.first;
micro_ntb = variable54;
variable55 = micro_root;
variable56 = new extra_boolean();
variable55.micro_Print(variable56);
variable57 = variable56.first;
micro_ntb = variable57;
variable58 = micro_root;
variable59 = new extra_int();
variable58.micro_Search(12, variable59);
variable60 = variable59.first;
System.out.println(variable60);
return_value.first = 0;
}
}
class micro_Tree {
micro_Tree micro_left;
micro_Tree micro_right;
int micro_key;
boolean micro_has_left;
boolean micro_has_right;
micro_Tree micro_my_null;
public void micro_Init(int micro_v_key, extra_boolean return_value) {
micro_key = micro_v_key;
micro_has_left = false;
micro_has_right = false;
return_value.first = true;
}
public void micro_SetRight(micro_Tree micro_rn, extra_boolean return_value) {
micro_right = micro_rn;
return_value.first = true;
}
public void micro_SetLeft(micro_Tree micro_ln, extra_boolean return_value) {
micro_left = micro_ln;
return_value.first = true;
}
public void micro_GetRight(extra_micro_Tree return_value) {
return_value.first = micro_right;
}
public void micro_GetLeft(extra_micro_Tree return_value) {
return_value.first = micro_left;
}
public void micro_GetKey(extra_int return_value) {
return_value.first = micro_key;
}
public void micro_SetKey(int micro_v_key, extra_boolean return_value) {
micro_key = micro_v_key;
return_value.first = true;
}
public void micro_GetHas_Right(extra_boolean return_value) {
return_value.first = micro_has_right;
}
public void micro_GetHas_Left(extra_boolean return_value) {
return_value.first = micro_has_left;
}
public void micro_SetHas_Left(boolean micro_val, extra_boolean return_value) {
micro_has_left = micro_val;
return_value.first = true;
}
public void micro_SetHas_Right(boolean micro_val, extra_boolean return_value) {
micro_has_right = micro_val;
return_value.first = true;
}
public void micro_Compare(int micro_num1, int micro_num2, extra_boolean return_value) {
boolean micro_ntb;
int micro_nti;
micro_ntb = false;
micro_nti = micro_num2+1;
if(micro_num1<micro_num2){
micro_ntb = false;
}
else {
if(!(micro_num1<micro_nti)){
micro_ntb = false;
}
else {
micro_ntb = true;
}
}
return_value.first = micro_ntb;
}
public void micro_Insert(int micro_v_key, extra_boolean return_value) {
micro_Tree micro_new_node;
boolean micro_ntb;
boolean micro_cont;
int micro_key_aux;
micro_Tree micro_current_node;
micro_Tree variable61;
extra_boolean variable62;
boolean variable63;
micro_Tree variable64;
extra_int variable65;
int variable66;
micro_Tree variable67;
extra_boolean variable68;
boolean variable69;
micro_Tree variable70;
extra_micro_Tree variable71;
micro_Tree variable72;
micro_Tree variable73;
extra_boolean variable74;
boolean variable75;
micro_Tree variable76;
extra_boolean variable77;
boolean variable78;
micro_Tree variable79;
extra_boolean variable80;
boolean variable81;
micro_Tree variable82;
extra_micro_Tree variable83;
micro_Tree variable84;
micro_Tree variable85;
extra_boolean variable86;
boolean variable87;
micro_Tree variable88;
extra_boolean variable89;
boolean variable90;
micro_new_node = new micro_Tree();
variable61 = micro_new_node;
variable62 = new extra_boolean();
variable61.micro_Init(micro_v_key, variable62);
variable63 = variable62.first;
micro_ntb = variable63;
micro_current_node = this;
micro_cont = true;
while(micro_cont){
{
variable64 = micro_current_node;
variable65 = new extra_int();
variable64.micro_GetKey(variable65);
variable66 = variable65.first;
micro_key_aux = variable66;
if(micro_v_key<micro_key_aux){
{
variable67 = micro_current_node;
variable68 = new extra_boolean();
variable67.micro_GetHas_Left(variable68);
variable69 = variable68.first;
if(variable69){
variable70 = micro_current_node;
variable71 = new extra_micro_Tree();
variable70.micro_GetLeft(variable71);
variable72 = variable71.first;
micro_current_node = variable72;
}
else {
{
micro_cont = false;
variable73 = micro_current_node;
variable74 = new extra_boolean();
variable73.micro_SetHas_Left(true, variable74);
variable75 = variable74.first;
micro_ntb = variable75;
variable76 = micro_current_node;
variable77 = new extra_boolean();
variable76.micro_SetLeft(micro_new_node, variable77);
variable78 = variable77.first;
micro_ntb = variable78;
}
}
}
}
else {
{
variable79 = micro_current_node;
variable80 = new extra_boolean();
variable79.micro_GetHas_Right(variable80);
variable81 = variable80.first;
if(variable81){
variable82 = micro_current_node;
variable83 = new extra_micro_Tree();
variable82.micro_GetRight(variable83);
variable84 = variable83.first;
micro_current_node = variable84;
}
else {
{
micro_cont = false;
variable85 = micro_current_node;
variable86 = new extra_boolean();
variable85.micro_SetHas_Right(true, variable86);
variable87 = variable86.first;
micro_ntb = variable87;
variable88 = micro_current_node;
variable89 = new extra_boolean();
variable88.micro_SetRight(micro_new_node, variable89);
variable90 = variable89.first;
micro_ntb = variable90;
}
}
}
}
}
}
return_value.first = true;
}
public void micro_Delete(int micro_v_key, extra_boolean return_value) {
micro_Tree micro_current_node;
micro_Tree micro_parent_node;
boolean micro_cont;
boolean micro_found;
boolean micro_is_root;
int micro_key_aux;
boolean micro_ntb;
micro_Tree variable91;
extra_int variable92;
int variable93;
micro_Tree variable94;
extra_boolean variable95;
boolean variable96;
micro_Tree variable97;
extra_micro_Tree variable98;
micro_Tree variable99;
micro_Tree variable100;
extra_boolean variable101;
boolean variable102;
micro_Tree variable103;
extra_micro_Tree variable104;
micro_Tree variable105;
micro_Tree variable106;
extra_boolean variable107;
boolean variable108;
micro_Tree variable109;
extra_boolean variable110;
boolean variable111;
micro_Tree variable112;
extra_boolean variable113;
boolean variable114;
micro_Tree variable115;
extra_boolean variable116;
boolean variable117;
micro_current_node = this;
micro_parent_node = this;
micro_cont = true;
micro_found = false;
micro_is_root = true;
while(micro_cont){
{
variable91 = micro_current_node;
variable92 = new extra_int();
variable91.micro_GetKey(variable92);
variable93 = variable92.first;
micro_key_aux = variable93;
if(micro_v_key<micro_key_aux){
variable94 = micro_current_node;
variable95 = new extra_boolean();
variable94.micro_GetHas_Left(variable95);
variable96 = variable95.first;
if(variable96){
{
micro_parent_node = micro_current_node;
variable97 = micro_current_node;
variable98 = new extra_micro_Tree();
variable97.micro_GetLeft(variable98);
variable99 = variable98.first;
micro_current_node = variable99;
}
}
else {
micro_cont = false;
}
}
else {
if(micro_key_aux<micro_v_key){
variable100 = micro_current_node;
variable101 = new extra_boolean();
variable100.micro_GetHas_Right(variable101);
variable102 = variable101.first;
if(variable102){
{
micro_parent_node = micro_current_node;
variable103 = micro_current_node;
variable104 = new extra_micro_Tree();
variable103.micro_GetRight(variable104);
variable105 = variable104.first;
micro_current_node = variable105;
}
}
else {
micro_cont = false;
}
}
else {
{
if(micro_is_root){
variable106 = micro_current_node;
variable107 = new extra_boolean();
variable106.micro_GetHas_Right(variable107);
variable108 = variable107.first;
variable109 = micro_current_node;
variable110 = new extra_boolean();
variable109.micro_GetHas_Left(variable110);
variable111 = variable110.first;
if((!variable108)&(!variable111)){
micro_ntb = true;
}
else {
variable112 = this;
variable113 = new extra_boolean();
variable112.micro_Remove(micro_parent_node,  micro_current_node, variable113);
variable114 = variable113.first;
micro_ntb = variable114;
}
}
else {
variable115 = this;
variable116 = new extra_boolean();
variable115.micro_Remove(micro_parent_node,  micro_current_node, variable116);
variable117 = variable116.first;
micro_ntb = variable117;
}
micro_found = true;
micro_cont = false;
}
}
}
micro_is_root = false;
}
}
return_value.first = micro_found;
}
public void micro_Remove(micro_Tree micro_p_node, micro_Tree micro_c_node, extra_boolean return_value) {
boolean micro_ntb;
int micro_auxkey1;
int micro_auxkey2;
micro_Tree variable118;
extra_boolean variable119;
boolean variable120;
micro_Tree variable121;
extra_boolean variable122;
boolean variable123;
micro_Tree variable124;
extra_boolean variable125;
boolean variable126;
micro_Tree variable127;
extra_boolean variable128;
boolean variable129;
micro_Tree variable130;
extra_int variable131;
int variable132;
micro_Tree variable133;
extra_micro_Tree variable134;
micro_Tree variable135;
micro_Tree variable136;
extra_int variable137;
int variable138;
micro_Tree variable139;
extra_boolean variable140;
boolean variable141;
micro_Tree variable142;
extra_boolean variable143;
boolean variable144;
micro_Tree variable145;
extra_boolean variable146;
boolean variable147;
micro_Tree variable148;
extra_boolean variable149;
boolean variable150;
micro_Tree variable151;
extra_boolean variable152;
boolean variable153;
variable118 = micro_c_node;
variable119 = new extra_boolean();
variable118.micro_GetHas_Left(variable119);
variable120 = variable119.first;
if(variable120){
variable121 = this;
variable122 = new extra_boolean();
variable121.micro_RemoveLeft(micro_p_node,  micro_c_node, variable122);
variable123 = variable122.first;
micro_ntb = variable123;
}
else {
variable124 = micro_c_node;
variable125 = new extra_boolean();
variable124.micro_GetHas_Right(variable125);
variable126 = variable125.first;
if(variable126){
variable127 = this;
variable128 = new extra_boolean();
variable127.micro_RemoveRight(micro_p_node,  micro_c_node, variable128);
variable129 = variable128.first;
micro_ntb = variable129;
}
else {
{
variable130 = micro_c_node;
variable131 = new extra_int();
variable130.micro_GetKey(variable131);
variable132 = variable131.first;
micro_auxkey1 = variable132;
variable133 = micro_p_node;
variable134 = new extra_micro_Tree();
variable133.micro_GetLeft(variable134);
variable135 = variable134.first;
variable136 = (variable135);
variable137 = new extra_int();
variable136.micro_GetKey(variable137);
variable138 = variable137.first;
micro_auxkey2 = variable138;
variable139 = this;
variable140 = new extra_boolean();
variable139.micro_Compare(micro_auxkey1,  micro_auxkey2, variable140);
variable141 = variable140.first;
if(variable141){
{
variable142 = micro_p_node;
variable143 = new extra_boolean();
variable142.micro_SetLeft(micro_my_null, variable143);
variable144 = variable143.first;
micro_ntb = variable144;
variable145 = micro_p_node;
variable146 = new extra_boolean();
variable145.micro_SetHas_Left(false, variable146);
variable147 = variable146.first;
micro_ntb = variable147;
}
}
else {
{
variable148 = micro_p_node;
variable149 = new extra_boolean();
variable148.micro_SetRight(micro_my_null, variable149);
variable150 = variable149.first;
micro_ntb = variable150;
variable151 = micro_p_node;
variable152 = new extra_boolean();
variable151.micro_SetHas_Right(false, variable152);
variable153 = variable152.first;
micro_ntb = variable153;
}
}
}
}
}
return_value.first = true;
}
public void micro_RemoveRight(micro_Tree micro_p_node, micro_Tree micro_c_node, extra_boolean return_value) {
boolean micro_ntb;
micro_Tree variable154;
extra_boolean variable155;
boolean variable156;
micro_Tree variable157;
micro_Tree variable158;
extra_micro_Tree variable159;
micro_Tree variable160;
micro_Tree variable161;
extra_int variable162;
int variable163;
extra_boolean variable164;
boolean variable165;
micro_Tree variable166;
extra_micro_Tree variable167;
micro_Tree variable168;
micro_Tree variable169;
extra_boolean variable170;
boolean variable171;
micro_Tree variable172;
extra_boolean variable173;
boolean variable174;
variable154 = micro_c_node;
variable155 = new extra_boolean();
variable154.micro_GetHas_Right(variable155);
variable156 = variable155.first;
while(variable156){
{
variable157 = micro_c_node;
variable158 = micro_c_node;
variable159 = new extra_micro_Tree();
variable158.micro_GetRight(variable159);
variable160 = variable159.first;
variable161 = (variable160);
variable162 = new extra_int();
variable161.micro_GetKey(variable162);
variable163 = variable162.first;
variable164 = new extra_boolean();
variable157.micro_SetKey(variable163, variable164);
variable165 = variable164.first;
micro_ntb = variable165;
micro_p_node = micro_c_node;
variable166 = micro_c_node;
variable167 = new extra_micro_Tree();
variable166.micro_GetRight(variable167);
variable168 = variable167.first;
micro_c_node = variable168;
}
variable154 = micro_c_node;
variable155 = new extra_boolean();
variable154.micro_GetHas_Right(variable155);
variable156 = variable155.first;
}
variable169 = micro_p_node;
variable170 = new extra_boolean();
variable169.micro_SetRight(micro_my_null, variable170);
variable171 = variable170.first;
micro_ntb = variable171;
variable172 = micro_p_node;
variable173 = new extra_boolean();
variable172.micro_SetHas_Right(false, variable173);
variable174 = variable173.first;
micro_ntb = variable174;
return_value.first = true;
}
public void micro_RemoveLeft(micro_Tree micro_p_node, micro_Tree micro_c_node, extra_boolean return_value) {
boolean micro_ntb;
micro_Tree variable175;
extra_boolean variable176;
boolean variable177;
micro_Tree variable178;
micro_Tree variable179;
extra_micro_Tree variable180;
micro_Tree variable181;
micro_Tree variable182;
extra_int variable183;
int variable184;
extra_boolean variable185;
boolean variable186;
micro_Tree variable187;
extra_micro_Tree variable188;
micro_Tree variable189;
micro_Tree variable190;
extra_boolean variable191;
boolean variable192;
micro_Tree variable193;
extra_boolean variable194;
boolean variable195;
variable175 = micro_c_node;
variable176 = new extra_boolean();
variable175.micro_GetHas_Left(variable176);
variable177 = variable176.first;
while(variable177){
{
variable178 = micro_c_node;
variable179 = micro_c_node;
variable180 = new extra_micro_Tree();
variable179.micro_GetLeft(variable180);
variable181 = variable180.first;
variable182 = (variable181);
variable183 = new extra_int();
variable182.micro_GetKey(variable183);
variable184 = variable183.first;
variable185 = new extra_boolean();
variable178.micro_SetKey(variable184, variable185);
variable186 = variable185.first;
micro_ntb = variable186;
micro_p_node = micro_c_node;
variable187 = micro_c_node;
variable188 = new extra_micro_Tree();
variable187.micro_GetLeft(variable188);
variable189 = variable188.first;
micro_c_node = variable189;
}
variable175 = micro_c_node;
variable176 = new extra_boolean();
variable175.micro_GetHas_Left(variable176);
variable177 = variable176.first;
}
variable190 = micro_p_node;
variable191 = new extra_boolean();
variable190.micro_SetLeft(micro_my_null, variable191);
variable192 = variable191.first;
micro_ntb = variable192;
variable193 = micro_p_node;
variable194 = new extra_boolean();
variable193.micro_SetHas_Left(false, variable194);
variable195 = variable194.first;
micro_ntb = variable195;
return_value.first = true;
}
public void micro_Search(int micro_v_key, extra_int return_value) {
boolean micro_cont;
int micro_ifound;
micro_Tree micro_current_node;
int micro_key_aux;
micro_Tree variable196;
extra_int variable197;
int variable198;
micro_Tree variable199;
extra_boolean variable200;
boolean variable201;
micro_Tree variable202;
extra_micro_Tree variable203;
micro_Tree variable204;
micro_Tree variable205;
extra_boolean variable206;
boolean variable207;
micro_Tree variable208;
extra_micro_Tree variable209;
micro_Tree variable210;
micro_current_node = this;
micro_cont = true;
micro_ifound = 0;
while(micro_cont){
{
variable196 = micro_current_node;
variable197 = new extra_int();
variable196.micro_GetKey(variable197);
variable198 = variable197.first;
micro_key_aux = variable198;
if(micro_v_key<micro_key_aux){
variable199 = micro_current_node;
variable200 = new extra_boolean();
variable199.micro_GetHas_Left(variable200);
variable201 = variable200.first;
if(variable201){
variable202 = micro_current_node;
variable203 = new extra_micro_Tree();
variable202.micro_GetLeft(variable203);
variable204 = variable203.first;
micro_current_node = variable204;
}
else {
micro_cont = false;
}
}
else {
if(micro_key_aux<micro_v_key){
variable205 = micro_current_node;
variable206 = new extra_boolean();
variable205.micro_GetHas_Right(variable206);
variable207 = variable206.first;
if(variable207){
variable208 = micro_current_node;
variable209 = new extra_micro_Tree();
variable208.micro_GetRight(variable209);
variable210 = variable209.first;
micro_current_node = variable210;
}
else {
micro_cont = false;
}
}
else {
{
micro_ifound = 1;
micro_cont = false;
}
}
}
}
}
return_value.first = micro_ifound;
}
public void micro_Print(extra_boolean return_value) {
micro_Tree micro_current_node;
boolean micro_ntb;
micro_Tree variable211;
extra_boolean variable212;
boolean variable213;
micro_current_node = this;
variable211 = this;
variable212 = new extra_boolean();
variable211.micro_RecPrint(micro_current_node, variable212);
variable213 = variable212.first;
micro_ntb = variable213;
return_value.first = true;
}
public void micro_RecPrint(micro_Tree micro_node, extra_boolean return_value) {
boolean micro_ntb;
micro_Tree variable214;
extra_boolean variable215;
boolean variable216;
micro_Tree variable217;
micro_Tree variable218;
extra_micro_Tree variable219;
micro_Tree variable220;
extra_boolean variable221;
boolean variable222;
micro_Tree variable223;
extra_int variable224;
int variable225;
micro_Tree variable226;
extra_boolean variable227;
boolean variable228;
micro_Tree variable229;
micro_Tree variable230;
extra_micro_Tree variable231;
micro_Tree variable232;
extra_boolean variable233;
boolean variable234;
variable214 = micro_node;
variable215 = new extra_boolean();
variable214.micro_GetHas_Left(variable215);
variable216 = variable215.first;
if(variable216){
{
variable217 = this;
variable218 = micro_node;
variable219 = new extra_micro_Tree();
variable218.micro_GetLeft(variable219);
variable220 = variable219.first;
variable221 = new extra_boolean();
variable217.micro_RecPrint(variable220, variable221);
variable222 = variable221.first;
micro_ntb = variable222;
}
}
else {
micro_ntb = true;
}
variable223 = micro_node;
variable224 = new extra_int();
variable223.micro_GetKey(variable224);
variable225 = variable224.first;
System.out.println(variable225);
variable226 = micro_node;
variable227 = new extra_boolean();
variable226.micro_GetHas_Right(variable227);
variable228 = variable227.first;
if(variable228){
{
variable229 = this;
variable230 = micro_node;
variable231 = new extra_micro_Tree();
variable230.micro_GetRight(variable231);
variable232 = variable231.first;
variable233 = new extra_boolean();
variable229.micro_RecPrint(variable232, variable233);
variable234 = variable233.first;
micro_ntb = variable234;
}
}
else {
micro_ntb = true;
}
return_value.first = true;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_BT { micro_BT first;}
class extra_micro_Tree { micro_Tree first;}

