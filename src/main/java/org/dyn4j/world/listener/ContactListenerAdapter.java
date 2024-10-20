/*
 * Copyright (c) 2010-2021 William Bittle  http://www.dyn4j.org/
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted 
 * provided that the following conditions are met:
 * 
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions 
 *     and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
 *     and the following disclaimer in the documentation and/or other materials provided with the 
 *     distribution.
 *   * Neither the name of the copyright holder nor the names of its contributors may be used to endorse or 
 *     promote products derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR 
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND 
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL 
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER 
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT 
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.dyn4j.world.listener;

import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.dynamics.PhysicsBody;
import org.dyn4j.dynamics.contact.Contact;
import org.dyn4j.dynamics.contact.SolvedContact;
import org.dyn4j.world.ContactCollisionData;

/**
 * Convenience class for implementing the {@link ContactListener} interface.
 * @author William Bittle
 * @version 4.1.0
 * @since 1.0.0
 * @param <T> the {@link PhysicsBody} type
 */
public class ContactListenerAdapter<F extends BodyFixture, T extends PhysicsBody<F>> implements ContactListener<F, T> {
	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#begin(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.Contact)
	 */
	@Override
	public void begin(ContactCollisionData<F, T> collision, Contact contact) {}

	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#end(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.Contact)
	 */
	@Override
	public void end(ContactCollisionData<F, T> collision, Contact contact) {}

	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#destroyed(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.Contact)
	 */
	@Override
	public void destroyed(ContactCollisionData<F, T> collision, Contact contact) {}
	
	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#persist(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.Contact, org.dyn4j.dynamics.contact.Contact)
	 */
	@Override
	public void persist(ContactCollisionData<F, T> collision, Contact oldContact, Contact newContact) {}

	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#collision(org.dyn4j.world.ContactCollisionData)
	 */
	@Override
	public void collision(ContactCollisionData<F, T> collision) {}
	
	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#preSolve(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.Contact)
	 */
	@Override
	public void preSolve(ContactCollisionData<F, T> collision, Contact contact) {}

	/* (non-Javadoc)
	 * @see org.dyn4j.world.listener.ContactListener#postSolve(org.dyn4j.world.ContactCollisionData, org.dyn4j.dynamics.contact.SolvedContact)
	 */
	@Override
	public void postSolve(ContactCollisionData<F, T> collision, SolvedContact contact) {}
}
