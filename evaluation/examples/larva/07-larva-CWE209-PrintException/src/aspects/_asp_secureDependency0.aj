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

import good.Good;
import secure.SecureException;
import cwe.CWE209;

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
before () : (call(* *.doSomething(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="Good.doSomething";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*enterM0*/, 8/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*enterM0*/, 8/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="Good.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*enterM1*/, 8/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*enterM1*/, 8/*enterMethod*/);
}
}
before () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="CWE209.run";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 4/*enterM2*/, 8/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 4/*enterM2*/, 8/*enterMethod*/);
}
}
before () : (call(* *.printStackTrace(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="SecureException.printStackTrace";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 6/*enterM3*/, 8/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 6/*enterM3*/, 8/*enterMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 13/*returnM2*/, 17/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 13/*returnM2*/, 17/*exitMethod*/);
}
}
after () returning () : (call(* *.run(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 11/*returnM1*/, 17/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 11/*returnM1*/, 17/*exitMethod*/);
}
}
after () returning () : (call(* *.doSomething(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 9/*returnM0*/, 17/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 9/*returnM0*/, 17/*exitMethod*/);
}
}
after () returning () : (call(* *.printStackTrace(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 15/*returnM3*/, 17/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 15/*returnM3*/, 17/*exitMethod*/);
}
}
}