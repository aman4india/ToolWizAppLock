/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data.VisitorModelDao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.cleanwiz.applock.data.VisitorModel;

import com.cleanwiz.applock.data.VisitorModelDao.VisitorModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig visitorModelDaoConfig;

    private final VisitorModelDao visitorModelDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        visitorModelDaoConfig = daoConfigMap.get(VisitorModelDao.class).clone();
        visitorModelDaoConfig.initIdentityScope(type);

        visitorModelDao = new VisitorModelDao(visitorModelDaoConfig, this);

        registerDao(VisitorModel.class, visitorModelDao);
    }
    
    public void clear() {
        visitorModelDaoConfig.getIdentityScope().clear();
    }

    public VisitorModelDao getVisitorModelDao() {
        return visitorModelDao;
    }

}