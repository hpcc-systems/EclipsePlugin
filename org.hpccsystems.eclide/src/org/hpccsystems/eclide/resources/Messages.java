package org.hpccsystems.eclide.resources;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.hpccsystems.eclide.resources.messages"; //$NON-NLS-1$
	
	//Properties from org.hpccsystems.eclide.builder package
	public static String CheckingSyntax;
	public static String Error_Eclcc_Not_Found;
	public static String Eclcc_Console_Output;
	public static String Error_Compiler_Config;

	// Properties from org.hpccsystems.eclide.editors package
	public static String AnnotationHover;
	public static String Server;
	public static String Target;
	public static String Submit;
	public static String Compile;
	public static String Debug;
	public static String ECLEditorTextMessage;
	public static String TextHover_No_Meta;
	public static String TextHover_SearchInfo;
	public static String TextHover_SearchFor;
	public static String TextHover_Context;
	public static String TextHover_Match;
	public static String TextHover_Definition;
	public static String Error_NestedTextEditor;
	public static String Error_IEditorInput;
	public static String Close;
	public static String CloseOtherWorkunits;
	public static String CloseAllWorkunits;

	// Properties from org.hpccsystems.eclide.importWizards package
	public static String FileImportWizard;
	public static String ImportRepository;
	public static String ImportRepositoryFromRemoteServer;
	public static String ImportingAttributes;
	public static String Importing;
	public static String Trash;
	public static String ServerIP;
	public static String User;
	public static String Password;

	// Properties from org.hpccsystems.eclide.launchers package
	public static String Location;
	public static String WorkunitArguments;
	public static String InlineResultLimit;
	public static String MonitorDependees;
	public static String SupressErrors;
	public static String OverrideDefaults;
	public static String Eclcc_Compiler;
	public static String HpccClientTools;
	public static String CompilerArguments;
	public static String Common;
	public static String SyntaxCheck;
	public static String LocalCompile;
	public static String RemoteCompile;
	public static String Local;
	public static String DisableServer;
	public static String TemporarilyDisabled;
	public static String EclWatch;
	public static String Address;
	public static String Test;
	public static String ServerVersion;
	public static String CompilerVersion;
	public static String Error_BrowserControl;
	public static String Error_AuthenticationFailed;
	public static String Warning_WebBrowser_Creation_Failed;
	public static String UnableToConnect;
	public static String SSL;
	public static String Html_Message_Loading;
	public static String Html_Message_End;
	public static String HpccPlatform;
	public static String IP_Address;
	public static String Port;
	public static String CompileOnly;
	public static String Credentials;

	// Properties from org.hpccsystems.eclide.preferences
	public static String CompilerPreferences;
	public static String Miscellaneous;
	public static String EnableMetaProcessing;

	// Properties from org.hpccsystems.eclide.problem package
	public static String QuickFixDemo;
	public static String QuickFix_NotImplemented;
	public static String QuickFix_1;
	public static String QuickFix_2;

	// Properties from org.hpccsystems.eclide.ui.viewer package
	public static String Back;
	public static String Forward;
	public static String Refresh;

	// Properties from org.hpccsystems.eclide.ui.viewer.platform package
	public static String Targets;
	public static String QuerySets;
	public static String Files;
	public static String Inputs;
	public static String RecursiveExpansion;
	public static String DropZones;
	public static String FileSprays;
	public static String Graphs;
	public static String WorkunitTempFiles;
	public static String RefreshEachItem;
	public static String ShowECLWatch;
	public static String Update;
	public static String Outputs;
	public static String Abort;
	public static String Delete;
	public static String Resubmit;
	public static String Restart;
	public static String Clone;
	public static String Publish;
	public static String Msg_Loading;
	public static String Msg_Calculating;
	public static String Today;
	public static String LastWeek;
	public static String WeeksAgo;
	public static String Query;

	// Properties from org.hpccsystems.eclide.wizards package
	public static String Error;
	public static String Creating;
	public static String Msg_Container;
	public static String Msg_DoesNotExist;
	public static String Msg_OpeningFileForEditing;
	public static String NewEclFile;
	public static String MultiPageEditorFile;
	public static String Msg_ProjectMustBeWritable;
	public static String Msg_FilenameMustBeSpecified;
	public static String Msg_ValidFileName;
	public static String Msg_NewFile;
	public static String Container;
	public static String Browse;
	public static String FileName;
	public static String Msg_FileExtension;
	public static String Msg_NewFileContainer;
	public static String Msg_FileContainerMustBeSpecified;
	public static String Msg_FileContainerMustExist;
	public static String Msg_NewFile_2;
	public static String ProjectName;
	public static String Msg_ProjectNameMustBeSpecified;
	public static String Msg_ValidProjectName;
	public static String DummyValue;

	// Properties from org.hpccsystems.internal package
	public static String Lbl_ERR;

	// Properties from org.hpccsystems.internal.data package
	public static String ClientTools;
	public static String ECLLibrary;
	public static String Bundles;
	public static String Examples;
	public static String CompilerMismatch;
	public static String Lbl_Server;
	public static String Msg_Eclcc_Not_Found;
	public static String Msg_MatchingClientTools;
	public static String Double_Quote;
	public static String EclPlugin;
	public static String DisableCurrentSession;
	public static String UnableToSubmitECL;
	public static String Msg_Unreachable;
	public static String Unknown;

	// Properties from org.hpccsystems.internal.ui.tree package
	public static String TODO;
	public static String Msg_Loading_2;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
