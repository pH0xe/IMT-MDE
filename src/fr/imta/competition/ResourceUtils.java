package fr.imta.competition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import imt.imtmde.Competition;
import imt.imtmde.ImtmdePackage;

public class ResourceUtils {
	private ResourceSet resourceSet;
	private Resource resource;
	
	private EList<Competition> competitions;
	
	public ResourceUtils() {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet
			.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put(
				"xmi",
				new XMIResourceFactoryImpl()
			);
		this.resourceSet.getPackageRegistry().put(
			ImtmdePackage.eNS_URI,
			ImtmdePackage.eINSTANCE
		);
	}
	
	public void chargerModele(String path) {
		URI uri = URI.createFileURI(path);
		resource = resourceSet.getResource(uri, true);
		competitions = (EList<Competition>)(Object) resource.getContents();
	}
	
	public void creerRessource(String path) {
		URI uri = URI.createFileURI(path);
		resource = resourceSet.createResource(uri);
	}
	
	public void sauvegarderResource() throws IOException {
		resource.save(Collections.EMPTY_MAP);
	}
	
	public void ajoutCompetion(Competition competition) {
		resource.getContents().add(competition);
		this.competitions.add(competition);
	}
	
	public EList<Competition> getCompetions() {
		return competitions;
	}
	
}
