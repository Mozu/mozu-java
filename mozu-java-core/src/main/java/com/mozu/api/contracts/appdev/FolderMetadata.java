/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.appdev.FileMetadata;
import com.mozu.api.contracts.appdev.FolderMetadata;

/**
 *	Metadata associated with a folder in a package of files for an application version.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FolderMetadata implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The directory of the file location of the folder in the package.
	 */
	protected  String fullPath;

	public String getFullPath() {
		return this.fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Array list of files in the folder.
	 */
	protected List<FileMetadata> files;
	public List<FileMetadata> getFiles() {
		return this.files;
	}
	public void setFiles(List<FileMetadata> files) {
		this.files = files;
	}

	/**
	 * Array list of subfolders stored in this folder.
	 */
	protected List<FolderMetadata> subFolders;
	public List<FolderMetadata> getSubFolders() {
		return this.subFolders;
	}
	public void setSubFolders(List<FolderMetadata> subFolders) {
		this.subFolders = subFolders;
	}


}
