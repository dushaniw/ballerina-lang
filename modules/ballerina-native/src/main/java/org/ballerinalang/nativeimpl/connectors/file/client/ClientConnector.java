/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ballerinalang.nativeimpl.connectors.file.client;

import org.ballerinalang.model.SymbolScope;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.natives.annotations.Attribute;
import org.ballerinalang.natives.annotations.BallerinaAnnotation;
import org.ballerinalang.natives.annotations.BallerinaConnector;
import org.ballerinalang.natives.connectors.AbstractNativeConnector;
import org.osgi.service.component.annotations.Component;


/**
 * Native File Client Connector.
 */
@BallerinaConnector(
        packageName = "ballerina.net.file",
        connectorName = ClientConnector.CONNECTOR_NAME,
        args = {})
@Component(
        name = "ballerina.net.connectors.file",
        immediate = true,
        service = AbstractNativeConnector.class)
@BallerinaAnnotation(annotationName = "Description", attributes = { @Attribute(name = "value",
        value = "Native File Client Connector") })
public class ClientConnector extends AbstractNativeConnector {

    public static final String CONNECTOR_NAME = "ClientConnector";


    public ClientConnector(SymbolScope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public boolean init(BValue[] bValueRefs) {
        return true;
    }

    @Override
    public AbstractNativeConnector getInstance() {
        return new ClientConnector(symbolScope);
    }



    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return (pkgPath + ":" + typeName).hashCode();
    }
}
