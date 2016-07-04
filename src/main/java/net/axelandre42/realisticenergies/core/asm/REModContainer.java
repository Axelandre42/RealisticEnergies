package net.axelandre42.realisticenergies.core.asm;

import java.io.File;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.MetadataCollection;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import net.minecraftforge.fml.common.versioning.VersionRange;

public class REModContainer implements ModContainer {

	@Override
	public String getModId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModMetadata getMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bindMetadata(MetadataCollection mc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabledState(boolean enabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<ArtifactVersion> getRequirements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtifactVersion> getDependencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtifactVersion> getDependants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSortingRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(Object mod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getMod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArtifactVersion getProcessedVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDisplayVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VersionRange acceptableMinecraftVersionRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certificate getSigningCertificate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getCustomModProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getCustomResourcePackClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getSharedModDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disableable canBeDisabled() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGuiClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getOwnedPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldLoadInEnvironment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public URL getUpdateUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClassVersion(int classVersion) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getClassVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
