/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.portal.webui.test;


import org.exoplatform.webui.config.annotation.ComponentConfig; 
import org.exoplatform.webui.core.UIComponent; 
import org.exoplatform.webui.core.lifecycle.UIApplicationLifecycle; 

/**
 * Created by The eXo Platform SAS
 * Author : Canh Pham Van
 *          canhpv@exoplatform.com
 * Sep 17, 2012  
 */
@ComponentConfig( 
   lifecycle = UIApplicationLifecycle.class, 
   template = "app:/groovy/testRomain/portlet/UIHelloWorldPopupContent.gtmpl" 
  ) 
public class UIHelloWorldPopupContent extends UIComponent { 
  public UIHelloWorldPopupContent() throws Exception { 
  } 
}