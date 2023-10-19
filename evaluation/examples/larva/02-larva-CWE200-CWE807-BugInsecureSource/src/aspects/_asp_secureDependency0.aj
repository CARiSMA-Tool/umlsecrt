package aspects;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import good.MethodSetCall;
import good.MethodGetCall;
import cwe.CWE200GetMethodCall;
import cwe.CWE807MethodSetCall;
import secret.ProtectedValues;


import larva.*;
public aspect _asp_secureDependency0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_secureDependency0.initialize();
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="CWE807MethodSetCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 12/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="MethodGetCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 6/*enterM4*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 6/*enterM4*/, 12/*enterMethod*/);
}
}
before () : (call(* *.getValue(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="ProtectedValues.getValue";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 10/*enterM6*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 10/*enterM6*/, 12/*enterMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 15/*returnM2*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 15/*returnM2*/);
}
}
after () returning () : (call(* *.getValue(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 23/*returnM6*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 23/*returnM6*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 19/*returnM4*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 19/*returnM4*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="CWE200GetMethodCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 12/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="MethodSetCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 4/*enterM3*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 4/*enterM3*/, 12/*enterMethod*/);
}
}
before () : (call(* *.setValue(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="ProtectedValues.setValue";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 8/*enterM5*/, 12/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 8/*enterM5*/, 12/*enterMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 13/*returnM1*/, 25/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 13/*returnM1*/, 25/*exitMethod*/);
}
}
after () returning () : (call(* *.setValue(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 21/*returnM5*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 21/*returnM5*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 17/*returnM3*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 17/*returnM3*/);
}
}
}