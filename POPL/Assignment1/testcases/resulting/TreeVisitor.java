class TreeVisitor { public static void main ( String[] micro_a) {
new new_TreeVisitor().print();
}
}
class new_TreeVisitor {
public void print() {
micro_TV variable1;
extra_int variable2;
int variable3;
variable1 = new micro_TV();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_TV {
public void micro_Start(extra_int return_value) {
micro_Tree micro_root;
boolean micro_ntb;
int micro_nti;
micro_MyVisitor micro_v;
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
extra_int variable35;
int variable36;
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
variable13.micro_Insert(24, variable14);
variable15 = variable14.first;
micro_ntb = variable15;
variable16 = micro_root;
variable17 = new extra_boolean();
variable16.micro_Insert(4, variable17);
variable18 = variable17.first;
micro_ntb = variable18;
variable19 = micro_root;
variable20 = new extra_boolean();
variable19.micro_Insert(12, variable20);
variable21 = variable20.first;
micro_ntb = variable21;
variable22 = micro_root;
variable23 = new extra_boolean();
variable22.micro_Insert(20, variable23);
variable24 = variable23.first;
micro_ntb = variable24;
variable25 = micro_root;
variable26 = new extra_boolean();
variable25.micro_Insert(28, variable26);
variable27 = variable26.first;
micro_ntb = variable27;
variable28 = micro_root;
variable29 = new extra_boolean();
variable28.micro_Insert(14, variable29);
variable30 = variable29.first;
micro_ntb = variable30;
variable31 = micro_root;
variable32 = new extra_boolean();
variable31.micro_Print(variable32);
variable33 = variable32.first;
micro_ntb = variable33;
System.out.println(100000000);
micro_v = new micro_MyVisitor();
System.out.println(50000000);
variable34 = micro_root;
variable35 = new extra_int();
variable34.micro_accept(micro_v, variable35);
variable36 = variable35.first;
micro_nti = variable36;
System.out.println(100000000);
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
public void micro_Init(int variable61, extra_boolean return_value) {
int micro_v_key;
micro_v_key = variable61;
micro_key = micro_v_key;
micro_has_left = false;
micro_has_right = false;
return_value.first = true;
}
public void micro_SetRight(micro_Tree variable62, extra_boolean return_value) {
micro_Tree micro_rn;
micro_rn = variable62;
micro_right = micro_rn;
return_value.first = true;
}
public void micro_SetLeft(micro_Tree variable63, extra_boolean return_value) {
micro_Tree micro_ln;
micro_ln = variable63;
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
public void micro_SetKey(int variable64, extra_boolean return_value) {
int micro_v_key;
micro_v_key = variable64;
micro_key = micro_v_key;
return_value.first = true;
}
public void micro_GetHas_Right(extra_boolean return_value) {
return_value.first = micro_has_right;
}
public void micro_GetHas_Left(extra_boolean return_value) {
return_value.first = micro_has_left;
}
public void micro_SetHas_Left(boolean variable65, extra_boolean return_value) {
boolean micro_val;
micro_val = variable65;
micro_has_left = micro_val;
return_value.first = true;
}
public void micro_SetHas_Right(boolean variable66, extra_boolean return_value) {
boolean micro_val;
micro_val = variable66;
micro_has_right = micro_val;
return_value.first = true;
}
public void micro_Compare(int variable67, int variable68, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_ntb;
int micro_nti;
micro_num1 = variable67;
micro_num2 = variable68;
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
public void micro_Insert(int variable69, extra_boolean return_value) {
int micro_v_key;
micro_Tree micro_new_node;
boolean micro_ntb;
micro_Tree micro_current_node;
boolean micro_cont;
int micro_key_aux;
micro_Tree variable70;
extra_boolean variable71;
boolean variable72;
micro_Tree variable73;
extra_int variable74;
int variable75;
micro_Tree variable76;
extra_boolean variable77;
boolean variable78;
micro_Tree variable79;
extra_micro_Tree variable80;
micro_Tree variable81;
micro_Tree variable82;
extra_boolean variable83;
boolean variable84;
micro_Tree variable85;
extra_boolean variable86;
boolean variable87;
micro_Tree variable88;
extra_boolean variable89;
boolean variable90;
micro_Tree variable91;
extra_micro_Tree variable92;
micro_Tree variable93;
micro_Tree variable94;
extra_boolean variable95;
boolean variable96;
micro_Tree variable97;
extra_boolean variable98;
boolean variable99;
micro_v_key = variable69;
micro_new_node = new micro_Tree();
variable70 = micro_new_node;
variable71 = new extra_boolean();
variable70.micro_Init(micro_v_key, variable71);
variable72 = variable71.first;
micro_ntb = variable72;
micro_current_node = this;
micro_cont = true;
while(micro_cont){
{
variable73 = micro_current_node;
variable74 = new extra_int();
variable73.micro_GetKey(variable74);
variable75 = variable74.first;
micro_key_aux = variable75;
if(micro_v_key<micro_key_aux){
{
variable76 = micro_current_node;
variable77 = new extra_boolean();
variable76.micro_GetHas_Left(variable77);
variable78 = variable77.first;
if(variable78){
variable79 = micro_current_node;
variable80 = new extra_micro_Tree();
variable79.micro_GetLeft(variable80);
variable81 = variable80.first;
micro_current_node = variable81;
}
else {
{
micro_cont = false;
variable82 = micro_current_node;
variable83 = new extra_boolean();
variable82.micro_SetHas_Left(true, variable83);
variable84 = variable83.first;
micro_ntb = variable84;
variable85 = micro_current_node;
variable86 = new extra_boolean();
variable85.micro_SetLeft(micro_new_node, variable86);
variable87 = variable86.first;
micro_ntb = variable87;
}
}
}
}
else {
{
variable88 = micro_current_node;
variable89 = new extra_boolean();
variable88.micro_GetHas_Right(variable89);
variable90 = variable89.first;
if(variable90){
variable91 = micro_current_node;
variable92 = new extra_micro_Tree();
variable91.micro_GetRight(variable92);
variable93 = variable92.first;
micro_current_node = variable93;
}
else {
{
micro_cont = false;
variable94 = micro_current_node;
variable95 = new extra_boolean();
variable94.micro_SetHas_Right(true, variable95);
variable96 = variable95.first;
micro_ntb = variable96;
variable97 = micro_current_node;
variable98 = new extra_boolean();
variable97.micro_SetRight(micro_new_node, variable98);
variable99 = variable98.first;
micro_ntb = variable99;
}
}
}
}
}
}
return_value.first = true;
}
public void micro_Delete(int variable100, extra_boolean return_value) {
int micro_v_key;
micro_Tree micro_current_node;
micro_Tree micro_parent_node;
boolean micro_cont;
boolean micro_found;
boolean micro_ntb;
boolean micro_is_root;
int micro_key_aux;
micro_Tree variable101;
extra_int variable102;
int variable103;
micro_Tree variable104;
extra_boolean variable105;
boolean variable106;
micro_Tree variable107;
extra_micro_Tree variable108;
micro_Tree variable109;
micro_Tree variable110;
extra_boolean variable111;
boolean variable112;
micro_Tree variable113;
extra_micro_Tree variable114;
micro_Tree variable115;
micro_Tree variable116;
extra_boolean variable117;
boolean variable118;
micro_Tree variable119;
extra_boolean variable120;
boolean variable121;
micro_Tree variable122;
extra_boolean variable123;
boolean variable124;
micro_Tree variable125;
extra_boolean variable126;
boolean variable127;
micro_v_key = variable100;
micro_current_node = this;
micro_parent_node = this;
micro_cont = true;
micro_found = false;
micro_is_root = true;
while(micro_cont){
{
variable101 = micro_current_node;
variable102 = new extra_int();
variable101.micro_GetKey(variable102);
variable103 = variable102.first;
micro_key_aux = variable103;
if(micro_v_key<micro_key_aux){
variable104 = micro_current_node;
variable105 = new extra_boolean();
variable104.micro_GetHas_Left(variable105);
variable106 = variable105.first;
if(variable106){
{
micro_parent_node = micro_current_node;
variable107 = micro_current_node;
variable108 = new extra_micro_Tree();
variable107.micro_GetLeft(variable108);
variable109 = variable108.first;
micro_current_node = variable109;
}
}
else {
micro_cont = false;
}
}
else {
if(micro_key_aux<micro_v_key){
variable110 = micro_current_node;
variable111 = new extra_boolean();
variable110.micro_GetHas_Right(variable111);
variable112 = variable111.first;
if(variable112){
{
micro_parent_node = micro_current_node;
variable113 = micro_current_node;
variable114 = new extra_micro_Tree();
variable113.micro_GetRight(variable114);
variable115 = variable114.first;
micro_current_node = variable115;
}
}
else {
micro_cont = false;
}
}
else {
{
if(micro_is_root){
variable116 = micro_current_node;
variable117 = new extra_boolean();
variable116.micro_GetHas_Right(variable117);
variable118 = variable117.first;
variable119 = micro_current_node;
variable120 = new extra_boolean();
variable119.micro_GetHas_Left(variable120);
variable121 = variable120.first;
if(!variable118&!variable121){
micro_ntb = true;
}
else {
variable122 = this;
variable123 = new extra_boolean();
variable122.micro_Remove(micro_parent_node,  micro_current_node, variable123);
variable124 = variable123.first;
micro_ntb = variable124;
}
}
else {
variable125 = this;
variable126 = new extra_boolean();
variable125.micro_Remove(micro_parent_node,  micro_current_node, variable126);
variable127 = variable126.first;
micro_ntb = variable127;
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
public void micro_Remove(micro_Tree variable128, micro_Tree variable129, extra_boolean return_value) {
micro_Tree micro_p_node;
micro_Tree micro_c_node;
boolean micro_ntb;
int micro_auxkey1;
int micro_auxkey2;
micro_Tree variable130;
extra_boolean variable131;
boolean variable132;
micro_Tree variable133;
extra_boolean variable134;
boolean variable135;
micro_Tree variable136;
extra_boolean variable137;
boolean variable138;
micro_Tree variable139;
extra_boolean variable140;
boolean variable141;
micro_Tree variable142;
extra_int variable143;
int variable144;
micro_Tree variable145;
extra_micro_Tree variable146;
micro_Tree variable147;
micro_Tree variable148;
extra_int variable149;
int variable150;
micro_Tree variable151;
extra_boolean variable152;
boolean variable153;
micro_Tree variable154;
extra_boolean variable155;
boolean variable156;
micro_Tree variable157;
extra_boolean variable158;
boolean variable159;
micro_Tree variable160;
extra_boolean variable161;
boolean variable162;
micro_Tree variable163;
extra_boolean variable164;
boolean variable165;
micro_p_node = variable128;
micro_c_node = variable129;
variable130 = micro_c_node;
variable131 = new extra_boolean();
variable130.micro_GetHas_Left(variable131);
variable132 = variable131.first;
if(variable132){
variable133 = this;
variable134 = new extra_boolean();
variable133.micro_RemoveLeft(micro_p_node,  micro_c_node, variable134);
variable135 = variable134.first;
micro_ntb = variable135;
}
else {
variable136 = micro_c_node;
variable137 = new extra_boolean();
variable136.micro_GetHas_Right(variable137);
variable138 = variable137.first;
if(variable138){
variable139 = this;
variable140 = new extra_boolean();
variable139.micro_RemoveRight(micro_p_node,  micro_c_node, variable140);
variable141 = variable140.first;
micro_ntb = variable141;
}
else {
{
variable142 = micro_c_node;
variable143 = new extra_int();
variable142.micro_GetKey(variable143);
variable144 = variable143.first;
micro_auxkey1 = variable144;
variable145 = micro_p_node;
variable146 = new extra_micro_Tree();
variable145.micro_GetLeft(variable146);
variable147 = variable146.first;
variable148 = (variable147);
variable149 = new extra_int();
variable148.micro_GetKey(variable149);
variable150 = variable149.first;
micro_auxkey2 = variable150;
variable151 = this;
variable152 = new extra_boolean();
variable151.micro_Compare(micro_auxkey1,  micro_auxkey2, variable152);
variable153 = variable152.first;
if(variable153){
{
variable154 = micro_p_node;
variable155 = new extra_boolean();
variable154.micro_SetLeft(micro_my_null, variable155);
variable156 = variable155.first;
micro_ntb = variable156;
variable157 = micro_p_node;
variable158 = new extra_boolean();
variable157.micro_SetHas_Left(false, variable158);
variable159 = variable158.first;
micro_ntb = variable159;
}
}
else {
{
variable160 = micro_p_node;
variable161 = new extra_boolean();
variable160.micro_SetRight(micro_my_null, variable161);
variable162 = variable161.first;
micro_ntb = variable162;
variable163 = micro_p_node;
variable164 = new extra_boolean();
variable163.micro_SetHas_Right(false, variable164);
variable165 = variable164.first;
micro_ntb = variable165;
}
}
}
}
}
return_value.first = true;
}
public void micro_RemoveRight(micro_Tree variable166, micro_Tree variable167, extra_boolean return_value) {
micro_Tree micro_p_node;
micro_Tree micro_c_node;
boolean micro_ntb;
micro_Tree variable168;
extra_boolean variable169;
boolean variable170;
micro_Tree variable171;
micro_Tree variable172;
extra_micro_Tree variable173;
micro_Tree variable174;
micro_Tree variable175;
extra_int variable176;
int variable177;
extra_boolean variable178;
boolean variable179;
micro_Tree variable180;
extra_micro_Tree variable181;
micro_Tree variable182;
micro_Tree variable183;
extra_boolean variable184;
boolean variable185;
micro_Tree variable186;
extra_boolean variable187;
boolean variable188;
micro_p_node = variable166;
micro_c_node = variable167;
variable168 = micro_c_node;
variable169 = new extra_boolean();
variable168.micro_GetHas_Right(variable169);
variable170 = variable169.first;
while(variable170){
{
variable171 = micro_c_node;
variable172 = micro_c_node;
variable173 = new extra_micro_Tree();
variable172.micro_GetRight(variable173);
variable174 = variable173.first;
variable175 = (variable174);
variable176 = new extra_int();
variable175.micro_GetKey(variable176);
variable177 = variable176.first;
variable178 = new extra_boolean();
variable171.micro_SetKey(variable177, variable178);
variable179 = variable178.first;
micro_ntb = variable179;
micro_p_node = micro_c_node;
variable180 = micro_c_node;
variable181 = new extra_micro_Tree();
variable180.micro_GetRight(variable181);
variable182 = variable181.first;
micro_c_node = variable182;
}
variable168 = micro_c_node;
variable169 = new extra_boolean();
variable168.micro_GetHas_Right(variable169);
variable170 = variable169.first;
}
variable183 = micro_p_node;
variable184 = new extra_boolean();
variable183.micro_SetRight(micro_my_null, variable184);
variable185 = variable184.first;
micro_ntb = variable185;
variable186 = micro_p_node;
variable187 = new extra_boolean();
variable186.micro_SetHas_Right(false, variable187);
variable188 = variable187.first;
micro_ntb = variable188;
return_value.first = true;
}
public void micro_RemoveLeft(micro_Tree variable189, micro_Tree variable190, extra_boolean return_value) {
micro_Tree micro_p_node;
micro_Tree micro_c_node;
boolean micro_ntb;
micro_Tree variable191;
extra_boolean variable192;
boolean variable193;
micro_Tree variable194;
micro_Tree variable195;
extra_micro_Tree variable196;
micro_Tree variable197;
micro_Tree variable198;
extra_int variable199;
int variable200;
extra_boolean variable201;
boolean variable202;
micro_Tree variable203;
extra_micro_Tree variable204;
micro_Tree variable205;
micro_Tree variable206;
extra_boolean variable207;
boolean variable208;
micro_Tree variable209;
extra_boolean variable210;
boolean variable211;
micro_p_node = variable189;
micro_c_node = variable190;
variable191 = micro_c_node;
variable192 = new extra_boolean();
variable191.micro_GetHas_Left(variable192);
variable193 = variable192.first;
while(variable193){
{
variable194 = micro_c_node;
variable195 = micro_c_node;
variable196 = new extra_micro_Tree();
variable195.micro_GetLeft(variable196);
variable197 = variable196.first;
variable198 = (variable197);
variable199 = new extra_int();
variable198.micro_GetKey(variable199);
variable200 = variable199.first;
variable201 = new extra_boolean();
variable194.micro_SetKey(variable200, variable201);
variable202 = variable201.first;
micro_ntb = variable202;
micro_p_node = micro_c_node;
variable203 = micro_c_node;
variable204 = new extra_micro_Tree();
variable203.micro_GetLeft(variable204);
variable205 = variable204.first;
micro_c_node = variable205;
}
variable191 = micro_c_node;
variable192 = new extra_boolean();
variable191.micro_GetHas_Left(variable192);
variable193 = variable192.first;
}
variable206 = micro_p_node;
variable207 = new extra_boolean();
variable206.micro_SetLeft(micro_my_null, variable207);
variable208 = variable207.first;
micro_ntb = variable208;
variable209 = micro_p_node;
variable210 = new extra_boolean();
variable209.micro_SetHas_Left(false, variable210);
variable211 = variable210.first;
micro_ntb = variable211;
return_value.first = true;
}
public void micro_Search(int variable212, extra_int return_value) {
int micro_v_key;
micro_Tree micro_current_node;
int micro_ifound;
boolean micro_cont;
int micro_key_aux;
micro_Tree variable213;
extra_int variable214;
int variable215;
micro_Tree variable216;
extra_boolean variable217;
boolean variable218;
micro_Tree variable219;
extra_micro_Tree variable220;
micro_Tree variable221;
micro_Tree variable222;
extra_boolean variable223;
boolean variable224;
micro_Tree variable225;
extra_micro_Tree variable226;
micro_Tree variable227;
micro_v_key = variable212;
micro_current_node = this;
micro_cont = true;
micro_ifound = 0;
while(micro_cont){
{
variable213 = micro_current_node;
variable214 = new extra_int();
variable213.micro_GetKey(variable214);
variable215 = variable214.first;
micro_key_aux = variable215;
if(micro_v_key<micro_key_aux){
variable216 = micro_current_node;
variable217 = new extra_boolean();
variable216.micro_GetHas_Left(variable217);
variable218 = variable217.first;
if(variable218){
variable219 = micro_current_node;
variable220 = new extra_micro_Tree();
variable219.micro_GetLeft(variable220);
variable221 = variable220.first;
micro_current_node = variable221;
}
else {
micro_cont = false;
}
}
else {
if(micro_key_aux<micro_v_key){
variable222 = micro_current_node;
variable223 = new extra_boolean();
variable222.micro_GetHas_Right(variable223);
variable224 = variable223.first;
if(variable224){
variable225 = micro_current_node;
variable226 = new extra_micro_Tree();
variable225.micro_GetRight(variable226);
variable227 = variable226.first;
micro_current_node = variable227;
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
boolean micro_ntb;
micro_Tree micro_current_node;
micro_Tree variable228;
extra_boolean variable229;
boolean variable230;
micro_current_node = this;
variable228 = this;
variable229 = new extra_boolean();
variable228.micro_RecPrint(micro_current_node, variable229);
variable230 = variable229.first;
micro_ntb = variable230;
return_value.first = true;
}
public void micro_RecPrint(micro_Tree variable231, extra_boolean return_value) {
micro_Tree micro_node;
boolean micro_ntb;
micro_Tree variable232;
extra_boolean variable233;
boolean variable234;
micro_Tree variable235;
micro_Tree variable236;
extra_micro_Tree variable237;
micro_Tree variable238;
extra_boolean variable239;
boolean variable240;
micro_Tree variable241;
extra_int variable242;
int variable243;
micro_Tree variable244;
extra_boolean variable245;
boolean variable246;
micro_Tree variable247;
micro_Tree variable248;
extra_micro_Tree variable249;
micro_Tree variable250;
extra_boolean variable251;
boolean variable252;
micro_node = variable231;
variable232 = micro_node;
variable233 = new extra_boolean();
variable232.micro_GetHas_Left(variable233);
variable234 = variable233.first;
if(variable234){
{
variable235 = this;
variable236 = micro_node;
variable237 = new extra_micro_Tree();
variable236.micro_GetLeft(variable237);
variable238 = variable237.first;
variable239 = new extra_boolean();
variable235.micro_RecPrint(variable238, variable239);
variable240 = variable239.first;
micro_ntb = variable240;
}
}
else {
micro_ntb = true;
}
variable241 = micro_node;
variable242 = new extra_int();
variable241.micro_GetKey(variable242);
variable243 = variable242.first;
System.out.println(variable243);
variable244 = micro_node;
variable245 = new extra_boolean();
variable244.micro_GetHas_Right(variable245);
variable246 = variable245.first;
if(variable246){
{
variable247 = this;
variable248 = micro_node;
variable249 = new extra_micro_Tree();
variable248.micro_GetRight(variable249);
variable250 = variable249.first;
variable251 = new extra_boolean();
variable247.micro_RecPrint(variable250, variable251);
variable252 = variable251.first;
micro_ntb = variable252;
}
}
else {
micro_ntb = true;
}
return_value.first = true;
}
public void micro_accept(micro_Visitor variable253, extra_int return_value) {
micro_Visitor micro_v;
int micro_nti;
micro_Visitor variable254;
extra_int variable255;
int variable256;
micro_v = variable253;
System.out.println(333);
variable254 = micro_v;
variable255 = new extra_int();
variable254.micro_visit(this, variable255);
variable256 = variable255.first;
micro_nti = variable256;
return_value.first = 0;
}
}
class micro_Visitor {
micro_Tree micro_l;
micro_Tree micro_r;
public void micro_visit(micro_Tree variable257, extra_int return_value) {
micro_Tree micro_n;
int micro_nti;
micro_Tree variable258;
extra_boolean variable259;
boolean variable260;
micro_Tree variable261;
extra_micro_Tree variable262;
micro_Tree variable263;
micro_Tree variable264;
extra_int variable265;
int variable266;
micro_Tree variable267;
extra_boolean variable268;
boolean variable269;
micro_Tree variable270;
extra_micro_Tree variable271;
micro_Tree variable272;
micro_Tree variable273;
extra_int variable274;
int variable275;
micro_n = variable257;
variable258 = micro_n;
variable259 = new extra_boolean();
variable258.micro_GetHas_Right(variable259);
variable260 = variable259.first;
if(variable260){
{
variable261 = micro_n;
variable262 = new extra_micro_Tree();
variable261.micro_GetRight(variable262);
variable263 = variable262.first;
micro_r = variable263;
variable264 = micro_r;
variable265 = new extra_int();
variable264.micro_accept(this, variable265);
variable266 = variable265.first;
micro_nti = variable266;
}
}
else {
micro_nti = 0;
}
variable267 = micro_n;
variable268 = new extra_boolean();
variable267.micro_GetHas_Left(variable268);
variable269 = variable268.first;
if(variable269){
{
variable270 = micro_n;
variable271 = new extra_micro_Tree();
variable270.micro_GetLeft(variable271);
variable272 = variable271.first;
micro_l = variable272;
variable273 = micro_l;
variable274 = new extra_int();
variable273.micro_accept(this, variable274);
variable275 = variable274.first;
micro_nti = variable275;
}
}
else {
micro_nti = 0;
}
return_value.first = 0;
}
}
class micro_MyVisitor extends micro_Visitor {
public void micro_visit(micro_Tree variable276, extra_int return_value) {
micro_Tree micro_n;
int micro_nti;
micro_Tree variable277;
extra_boolean variable278;
boolean variable279;
micro_Tree variable280;
extra_micro_Tree variable281;
micro_Tree variable282;
micro_Tree variable283;
extra_int variable284;
int variable285;
micro_Tree variable286;
extra_int variable287;
int variable288;
micro_Tree variable289;
extra_boolean variable290;
boolean variable291;
micro_Tree variable292;
extra_micro_Tree variable293;
micro_Tree variable294;
micro_Tree variable295;
extra_int variable296;
int variable297;
micro_n = variable276;
variable277 = micro_n;
variable278 = new extra_boolean();
variable277.micro_GetHas_Right(variable278);
variable279 = variable278.first;
if(variable279){
{
variable280 = micro_n;
variable281 = new extra_micro_Tree();
variable280.micro_GetRight(variable281);
variable282 = variable281.first;
micro_r = variable282;
variable283 = micro_r;
variable284 = new extra_int();
variable283.micro_accept(this, variable284);
variable285 = variable284.first;
micro_nti = variable285;
}
}
else {
micro_nti = 0;
}
variable286 = micro_n;
variable287 = new extra_int();
variable286.micro_GetKey(variable287);
variable288 = variable287.first;
System.out.println(variable288);
variable289 = micro_n;
variable290 = new extra_boolean();
variable289.micro_GetHas_Left(variable290);
variable291 = variable290.first;
if(variable291){
{
variable292 = micro_n;
variable293 = new extra_micro_Tree();
variable292.micro_GetLeft(variable293);
variable294 = variable293.first;
micro_l = variable294;
variable295 = micro_l;
variable296 = new extra_int();
variable295.micro_accept(this, variable296);
variable297 = variable296.first;
micro_nti = variable297;
}
}
else {
micro_nti = 0;
}
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_TV { micro_TV first;}
class extra_micro_Tree { micro_Tree first;}
class extra_micro_Visitor { micro_Visitor first;}
class extra_micro_MyVisitor { micro_MyVisitor first;}

