package net.axelandre42.realisticenergies.asm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.eventbus.EventBus;

import net.axelandre42.realisticenergies.RealisticEnergies;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MetadataCollection;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;
import net.minecraftforge.fml.common.versioning.InvalidVersionSpecificationException;
import net.minecraftforge.fml.common.versioning.VersionRange;

public class ReModContainer implements ModContainer {

	private final String defaultModId   = "RealisticEnergies";
	private final String defaultName    = "Realistic Energies";
	private final String defaultVersion = "0.00";
	
	private ModMetadata md;
	private RealisticEnergies mod;
	private int classVersion;
	
	public ReModContainer() {
		this.mod = new RealisticEnergies();
		
		File source = this.getSource();
		InputStream stream = null;
		
		try {
			if (source != null)
				stream = new FileInputStream(source);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Object> extra = new HashMap<String, Object>();
		
		extra.put("name", this.defaultName);
		extra.put("version", this.defaultVersion);
		
		this.md = MetadataCollection.from(stream, source != null ? source.getName() : null).
				getMetadataForId(this.defaultModId, extra);
	}
	
	@Override
	public String getModId() {
		return this.md == null ? this.defaultModId : this.md.modId;
	}

	@Override
	public String getName() {
		return this.md == null ? this.defaultName : this.md.name;
	}

	@Override
	public String getVersion() {
		return this.md == null ? this.defaultVersion : this.md.version;
	}

	@Override
	public File getSource() {
		return ReCoremod.coremodLocation;
	}

	@Override
	public ModMetadata getMetadata() {
		return this.md;
	}

	@Override
	public void bindMetadata(MetadataCollection mc) {
		
	}

	@Override
	public void setEnabledState(boolean enabled) {

	}

	@Override
	public Set<ArtifactVersion> getRequirements() {
		return Collections.emptySet();
	}

	@Override
	public List<ArtifactVersion> getDependencies() {
		return Collections.emptyList();
	}

	@Override
	public List<ArtifactVersion> getDependants() {
		return Collections.emptyList();
	}

	@Override
	public String getSortingRules() {
		return "";
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this.mod);
		
		return true;
	}

	@Override
	public boolean matches(Object mod) {
		return this.mod.getClass().getName().equals(mod.getClass().getName());
	}

	@Override
	public Object getMod() {
		return this.mod;
	}

	@Override
	public ArtifactVersion getProcessedVersion() {
		return new DefaultArtifactVersion(this.getModId(), this.getVersion());
	}

	@Override
	public boolean isImmutable() {
		return false;
	}

	@Override
	public String getDisplayVersion() {
		return this.getVersion();
	}

	@Override
	public VersionRange acceptableMinecraftVersionRange() {
		VersionRange range;
		
		try {
			range = VersionRange.createFromVersionSpec("[1.10,1.11)");
		} catch (InvalidVersionSpecificationException e) {
			range = Loader.instance().getMinecraftModContainer().acceptableMinecraftVersionRange();
			e.printStackTrace();
		}
		
		return range;
	}

	@Override
	public Certificate getSigningCertificate() {
		return null;
	}

	@Override
	public Map<String, String> getCustomModProperties() {
		return EMPTY_PROPERTIES;
	}

	@Override
	public Class<?> getCustomResourcePackClass() {
		// TODO Create IResourcePack-implementing class.
		return null;
	}

	@Override
	public Map<String, String> getSharedModDescriptor() {
		return null;
	}

	@Override
	public Disableable canBeDisabled() {
		return Disableable.NEVER;
	}

	@Override
	public String getGuiClassName() {
		return null;
	}

	@Override
	public List<String> getOwnedPackages() {
		return null;
	}

	@Override
	public boolean shouldLoadInEnvironment() {
		return true;
	}

	@Override
	public URL getUpdateUrl() {
		return null;
	}

	@Override
	public void setClassVersion(int classVersion) {
		this.classVersion = classVersion;
	}

	@Override
	public int getClassVersion() {
		return this.classVersion;
	}

}
