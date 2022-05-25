package carisma.rt.models.loader;

import java.io.File;

import carisma.rt.models.protocol.RTProtocol;

public interface IProtocolLoader {

	RTProtocol loadRTProtocol(File location);
	
}
