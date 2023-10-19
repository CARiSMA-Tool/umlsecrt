package larva;


import java.util.LinkedList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collection;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import test.A;
import other.B;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_secureDependency0 implements _callable{

public static PrintWriter pw; 
public static _cls_secureDependency0 root;

public static LinkedHashMap<_cls_secureDependency0,_cls_secureDependency0> _cls_secureDependency0_instances;

_cls_secureDependency0 parent; //to remain null - this class does not have a parent!
public static String id;
int no_automata;

int _state_id_secureDependency;
 public LinkedList <String >stack =new LinkedList <>();
 public Map <String ,Collection <String >>secrecyMap =readSecurityLevels ("secrecy.json");

public static void initialize(){
//note that this initialisation does not include user-defined declarations in the Variables section


_cls_secureDependency0_instances = new LinkedHashMap<_cls_secureDependency0,_cls_secureDependency0>();
try{
pw = new PrintWriter("//home/sven/Desktop/larva//output_secureDependency.txt");

root = new _cls_secureDependency0();
_cls_secureDependency0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_secureDependency0() {
}

public void initialisation() {
no_automata = 1;
//initialise automata
_state_id_secureDependency = 1;
}

public static _cls_secureDependency0 _get_cls_secureDependency0_inst() { synchronized(_cls_secureDependency0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_secureDependency0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 1;
}

public void _call(String _info, int... _event){
synchronized(_cls_secureDependency0_instances){
_performLogic_secureDependency(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_secureDependency0[] a = new _cls_secureDependency0[1];
synchronized(_cls_secureDependency0_instances){
a = _cls_secureDependency0_instances.keySet().toArray(a);}
for (_cls_secureDependency0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_secureDependency0_instances){
_cls_secureDependency0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}


public void _performLogic_secureDependency(String _info, int... _event) {

_cls_secureDependency0.pw.println("[secureDependency]AUTOMATON::> secureDependency("+") STATE::>"+ _string_secureDependency(_state_id_secureDependency, 0));
_cls_secureDependency0.pw.flush();

if (0==1){}
else if (_state_id_secureDependency==1){
		if (1==0){}
		else if ((_occurredEvent(_event,9/*exit*/))){
		stack .pop ();

		_state_id_secureDependency = 1;//moving to state ok
		_goto_secureDependency(_info);
		}
		else if ((_occurredEvent(_event,4/*enter*/)) && (!checkSecureDependency (stack .peek (),id ))){
		
		_state_id_secureDependency = 0;//moving to state bad
System .err .println ("Illegal Access");
System .exit (-1 );

		_goto_secureDependency(_info);
		}
		else if ((_occurredEvent(_event,4/*enter*/))){
		stack .push (id );

		_state_id_secureDependency = 1;//moving to state ok
		_goto_secureDependency(_info);
		}
}
}

public void _goto_secureDependency(String _info){
 String state_format = _string_secureDependency(_state_id_secureDependency, 1);
_cls_secureDependency0.pw.println("[secureDependency]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + state_format);
_cls_secureDependency0.pw.flush();
}

public String _string_secureDependency(int _state_id, int _mode){
switch(_state_id){
case 0: if (_mode == 0) return "bad"; else return "!!!SYSTEM REACHED BAD STATE!!! bad "+new _BadStateExceptionsecureDependency().toString()+" ";
case 1: if (_mode == 0) return "ok"; else return "ok";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
boolean checkSecureDependency(String caller, String callee){
if(caller == null) {
return true;
}
Collection<String> calleeSecrecy = secrecyMap.get(callee);
if(secrecyMap.get(caller).contains(callee)) {
return calleeSecrecy.contains(callee);
}
return !calleeSecrecy.contains(callee);
}

Map<String, Collection<String>> readSecurityLevels(String path) {
try {
return (Map<String, Collection<String>>) new Gson().fromJson(Files.newBufferedReader(Paths.get(path)), Map.class);
} catch (Exception e) {
e.printStackTrace();
System.exit(-1);
}
return null;
}
}