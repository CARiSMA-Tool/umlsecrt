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
import secret.Secret;


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
after () returning () : (call(* *.Secret(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 3/*returnM1*/, 5/*exitMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 3/*returnM1*/, 5/*exitMethod*/);
}
}
before () : (call(* *.Secret(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="Secret.Secret";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 2/*enterMethod*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 2/*enterMethod*/);
}
}
}