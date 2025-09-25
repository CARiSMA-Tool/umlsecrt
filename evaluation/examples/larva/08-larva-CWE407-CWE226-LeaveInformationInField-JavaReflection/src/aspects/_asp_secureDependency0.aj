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

import good.GoodMethodCall;
import bad.BadMethodCall;
import example.ProtectedClass;


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
before () : (call(* *.m(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="ProtectedClass.m";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 6/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 6/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="GoodMethodCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 6/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 6/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="BadMethodCall.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 4/*enterM3*/, 6/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 4/*enterM3*/, 6/*enterMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 9/*returnM2*/, 13/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 9/*returnM2*/, 13/*exitMethod*/);
}
}
after () returning () : (call(* *.m(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 7/*returnM1*/, 13/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 7/*returnM1*/, 13/*exitMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 11/*returnM3*/, 13/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 11/*returnM3*/, 13/*exitMethod*/);
}
}
}