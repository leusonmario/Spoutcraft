/*
 * This file is part of Spoutcraft.
 *
 * Copyright (c) 2011 SpoutcraftDev <http://spoutcraft.org//>
 * Spoutcraft is licensed under the GNU Lesser General Public License.
 *
 * Spoutcraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Spoutcraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.api.animation;

public class LogarithmicAnimationProgress implements AnimationProgress {
	private int strength;
	private double slog;

	public LogarithmicAnimationProgress() {
		this(20);
	}

	public LogarithmicAnimationProgress(int strength) {
		this.strength = strength;
		this.slog = Math.log(strength + 1);
	}

	public double getValueAt(double progress) {
		return Math.log(progress * strength + 1) / slog;
	}
}
