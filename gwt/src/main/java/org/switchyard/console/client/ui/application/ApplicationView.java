/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.switchyard.console.client.ui.application;

import org.jboss.as.console.client.core.DisposableViewImpl;
import org.jboss.as.console.client.widgets.RHSContentPanel;
import org.switchyard.console.client.model.Application;

import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * ApplicationView
 * 
 * View for SwitchYard application details.
 * 
 * @author Rob Cernich
 */
public class ApplicationView extends DisposableViewImpl implements ApplicationPresenter.MyView {

    private ApplicationPresenter _presenter;

    private ApplicationEditor _applicationEditor;

    @Override
    public Widget createWidget() {

        LayoutPanel layout = new RHSContentPanel("Application Details");

        _applicationEditor = new ApplicationEditor(_presenter);
        layout.add(_applicationEditor.asWidget());

        return layout;
    }

    @Override
    public void setPresenter(ApplicationPresenter presenter) {
        this._presenter = presenter;
    }

    @Override
    public void setApplication(Application application) {
        _applicationEditor.setApplication(application);
    }

}