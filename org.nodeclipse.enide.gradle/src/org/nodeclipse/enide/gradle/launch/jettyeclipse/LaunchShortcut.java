package org.nodeclipse.enide.gradle.launch.jettyeclipse;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.nodeclipse.enide.gradle.preferences.GradleConstants;
//import org.nodeclipse.ui.util.NodeclipseConsole;

/**
 * Using "Run As" --> "gradle jettyRun" will lead here
 **/
public class LaunchShortcut  
	extends org.nodeclipse.enide.gradle.launch.LaunchShortcut
	implements ILaunchShortcut
{

	@Override
	protected String getLaunchConfigurationTypeConstant() {
		return GradleConstants.LAUNCH_JETTYECLIPSE_CONFIGURATION_TYPE_ID;
	}

}
